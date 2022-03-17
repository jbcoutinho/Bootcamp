package br.com.jabcneto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.jabcneto.model.Cliente;
import br.com.jabcneto.model.Fatura;
import br.com.jabcneto.model.Item;
import br.com.jabcneto.service.ClienteService;
import br.com.jabcneto.service.FaturaService;

public class Main {
	
	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>(Arrays.asList(new Cliente("1", "Fulano", "De Tal"),
				new Cliente("2", "Ciclano", "Teste"), new Cliente("3", "Beltrano", "Teste")));

		List<Fatura> faturas = new ArrayList<>();

		ClienteService clienteService = new ClienteService(clientes);

		FaturaService faturaService = new FaturaService(faturas, clientes);

		Scanner sc = new Scanner(System.in);
		int menu1 = 0;

		do {
			System.out.println("--------------------------------------");
			System.out.println("	1 - Clientes");
			System.out.println("	2 - Faturas");
			System.out.println("	0 - Finalizar");
			System.out.println("--------------------------------------");
			System.out.println("Digite uma opcao: ");

			menu1 = sc.nextInt();
			if (menu1 != 0) {
				switch (menu1) {
				case 1:
					menuCliente(clienteService, sc);
					break;
				case 2:
					menuFatura(clienteService, faturaService, sc);
					break;

				default:
					break;
				}

			}

		} while (menu1 != 0);
		sc.close();
	}

	private static void menuFatura(ClienteService clienteService, FaturaService faturaService, Scanner sc) {
		int menu2;
		do {
			String id;
			System.out.println("--------------------------------------");
			System.out.println("	1 - Nova Fatura");
			System.out.println("	2 - Buscar Fatura");
			System.out.println("	0 - Voltar");
			System.out.println("--------------------------------------");
			System.out.println("Digite uma opcao: ");
			menu2 = sc.nextInt();

			switch (menu2) {
			case 1:
				sc.nextLine();
				System.out.print("Digite o codigo do cliente: ");
				id = sc.nextLine();
				try {
					Cliente cliente = clienteService.findById(id);
					int terminou = 0;
					ArrayList<Item> items = new ArrayList<>();
					while (terminou == 0) {
						System.out.println("Adicione items a fatura:");
						System.out.print("Nome: ");
						String nome = sc.nextLine();
						System.out.print("Preco: ");
						BigDecimal preco = BigDecimal.valueOf(sc.nextDouble());
						System.out.print("Quantidade: ");
						int quantidade = sc.nextInt();
						Item item = Item.builder().nome(nome).custoUnitario(preco).quantidade(quantidade).build();
						items.add(item);
						sc.nextLine();
						System.out.print("Finalizar? 0 - nao 1-Sim ");
						terminou = sc.nextInt();
						sc.nextLine();
					}
					faturaService.create(new Fatura(cliente, items));
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				sc.nextLine();
				System.out.print("Digite o id do cliente: ");
				id = sc.nextLine();
				List<Fatura> faturas = faturaService.findByClientId(id);
				System.out.println(faturas);
				break;
			case 3:
				sc.nextLine();
				break;
			case 4:
				sc.nextLine();
				System.out.print("Digite o id: ");
				id = sc.nextLine();
				clienteService.delete(id);
				break;
			case 0:
				menu2 = 0;
				break;

			default:
				break;
			}
		} while (menu2 != 0);
	}

	private static void menuCliente(ClienteService clienteService, Scanner sc) {
		int menu2;
		do {
			String id;
			System.out.println("--------------------------------------");
			System.out.println("	1 - Listar");
			System.out.println("	2 - Buscar pelo ID");
			System.out.println("	3 - Remover");
			System.out.println("	0 - Voltar");
			System.out.println("--------------------------------------");
			System.out.println("Digite uma opcao: ");
			menu2 = sc.nextInt();

			switch (menu2) {
			case 1:
				clienteService.findAll();
				break;
			case 2:
				sc.nextLine();
				System.out.print("Digite o ID para buscar: ");
				id = sc.nextLine();
				clienteService.findById(id);
				break;
			case 3:
				sc.nextLine();
				System.out.print("Digite o ID para deletar: ");
				id = sc.nextLine();
				clienteService.delete(id);
				break;
			case 0:
				menu2 = 0;
				break;

			default:
				break;
			}
		} while (menu2 != 0);
	}

}
