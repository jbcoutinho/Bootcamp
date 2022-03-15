package br.com.jbcoutinho;

import java.util.Map;
import java.util.Scanner;

import br.com.jbcoutinho.model.Categoria;
import br.com.jbcoutinho.model.NomeCategoria;
import br.com.jbcoutinho.model.Participante;

public class Pratica2 {
	public static void main(String[] args) {

		Integer menu1 = 0;
		Integer menu2 = 0;
		Categoria circuitoPequeno = new Categoria(NomeCategoria.CIRCUITO_PEQUENO, "2km", "selva e riachos.");
		Categoria circuitoMedio = new Categoria(NomeCategoria.CIRCUITO_MEDIO, "5km", "selva, riachos e lama.");
		Categoria circuitoAvancado = new Categoria(NomeCategoria.CIRCUITO_AVANCADO, "10km",
				"selva, riachos, lama e escalada.");
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("----------- MENU INSCRICOES-----------");
			System.out.println("1 - registrar");
			System.out.println("2 - listar");
			System.out.println("3 - cancelar");
			System.out.println("4 - simular");
			System.out.println("0 - terminar");
			System.out.println("--------------------------------------");
			menu1 = sc.nextInt();
			switch (menu1) {
			case 1:
				do {
					System.out.println("Selecione uma categoria: ");
					System.out.println("1-Circuito Pequeno");
					System.out.println("2-Circuito Medio");
					System.out.println("3-Circuito Avancado");
					System.out.println("0-voltar");
					menu2 = sc.nextInt();

					Participante participante = null;
					if (menu2 != 0) {
						sc.nextLine();
						System.out.print("RG: ");
						String rg = sc.nextLine();
						System.out.print("NOME: ");
						String nome = sc.nextLine();
						System.out.print("SOBRENOME: ");
						String sobrenome = sc.nextLine();
						System.out.print("CELULAR: ");
						String celular = sc.nextLine();
						System.out.print("NUMERO EMERGENCIA: ");
						String numeroEmergencia = sc.nextLine();
						System.out.print("GRUPO SANGUINEO: ");
						String grupoSanguineo = sc.nextLine();
						System.out.print("IDADE: ");
						int idade = sc.nextInt();
						participante = new Participante(rg, nome, sobrenome, idade, celular, numeroEmergencia,
								grupoSanguineo);
					}

					switch (menu2) {
					case 1:
						if (!(circuitoMedio.getPartiticipantes().containsValue(participante)
								|| circuitoAvancado.getPartiticipantes().containsValue(participante))) {
							circuitoPequeno.registraParticipante(participante);
						}
						break;
					case 2:
						if (!(circuitoPequeno.getPartiticipantes().containsValue(participante)
								|| circuitoAvancado.getPartiticipantes().containsValue(participante))) {
							circuitoMedio.registraParticipante(participante);
						}
						break;

					case 3:
						if (!(circuitoPequeno.getPartiticipantes().containsValue(participante)
								|| circuitoMedio.getPartiticipantes().containsValue(participante))) {
							circuitoAvancado.registraParticipante(participante);
						}
						break;
					case 0:
						menu2 = 0;
						break;

					default:
						break;
					}

					System.out.println();
				} while (menu2 != 0);
				break;
			case 2:
				do {
					System.out.println("Selecione uma categoria: ");
					System.out.println("1-Circuito Pequeno");
					System.out.println("2-Circuito Medio");
					System.out.println("3-Circuito Avancado");
					System.out.println("0-voltar");
					menu2 = sc.nextInt();
					switch (menu2) {
					case 1:
						System.out.println("Listando Participantes da categoria " + circuitoPequeno.getNome());
						Map<Integer, Participante> partiticipantes = circuitoPequeno.getPartiticipantes();
						for (Integer key : partiticipantes.keySet()) {
							System.out.println(key + "º: " + partiticipantes.get(key));
						}
						break;
					case 0:
						menu2 = 0;
						break;
					default:
						break;
					}
					System.out.println();
				} while (menu2 != 0);
				break;
			case 3:
				do {
					System.out.println("Selecione uma categoria: ");
					System.out.println("1-Circuito Pequeno");
					System.out.println("2-Circuito Medio");
					System.out.println("3-Circuito Avancado");
					System.out.println("0-voltar");
					menu2 = sc.nextInt();
					switch (menu2) {
					case 1:
						System.out.print("Digite o nr da inscricao: ");
						circuitoPequeno.cancelaInscricao(sc.nextInt());
						break;
					case 2:
						System.out.print("Digite o nr da inscricao: ");
						circuitoMedio.cancelaInscricao(sc.nextInt());
						break;
					case 3:
						System.out.print("Digite o nr da inscricao: ");
						circuitoAvancado.cancelaInscricao(sc.nextInt());
						break;
					case 0:
						menu2 = 0;
						break;

					default:
						break;
					}

					System.out.println();
				} while (menu2 != 0);
				break;
			case 4:
				do {
					System.out.println("Simular inscricao: ");
					System.out.println("1-Circuito Pequeno");
					System.out.println("2-Circuito Medio");
					System.out.println("3-Circuito Avancado");
					System.out.println("0-voltar");
					menu2 = sc.nextInt();

					Participante participante = new Participante();
					if (menu2 != 0) {
						System.out.print("IDADE: ");
						int idade = sc.nextInt();
						participante.setIdade(idade);
					}

					switch (menu2) {
					case 1:
						circuitoPequeno.calculaCustoInscricao(participante);
						break;
					case 2:
						circuitoMedio.calculaCustoInscricao(participante);
						break;
					case 3:
						circuitoAvancado.calculaCustoInscricao(participante);
						break;
					case 0:
						menu2 = 0;
						break;

					default:
						break;
					}

					System.out.println();
				} while (menu2 != 0);
				break;
			case 0:
				menu1 = 0;
				break;

			default:
				break;
			}
		} while (menu1 != 0);
		sc.close();
	}
}
