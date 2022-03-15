package br.com.jbcneto;

import java.util.Scanner;

import br.com.jbcneto.model.Pessoa;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu1 = 0;
		do {
			System.out.println("----------- MENU INSCRICOES-----------");
			System.out.println("1 - IMC");
			System.out.println("0 - Finalizar");
			System.out.println("--------------------------------------");
			menu1 = sc.nextInt();
			switch (menu1) {
			case 1:
				System.out.println("----------- Entre com seus dados ----------- ");

				sc.nextLine();
				System.out.print("RG: ");
				String rg = sc.nextLine();
				System.out.print("NOME: ");
				String nome = sc.nextLine();
				System.out.print("IDADE: ");
				Integer idade = sc.nextInt();
				System.out.print("PESO(Kg): ");
				Double peso = sc.nextDouble();
				System.out.print("ALTURA(m): ");
				Double altura = sc.nextDouble();
				Pessoa pessoa = new Pessoa(rg, nome, idade, peso, altura);

				Integer calculaIMC = pessoa.calculaIMC();

				if (calculaIMC.equals(-1)) {
					System.out.println("Abaixo do peso");
				} else if (calculaIMC.equals(0)) {
					System.out.println("Peso Saudavel");
				} else if (calculaIMC.equals(1)) {
					System.out.println("Sobrepeso");
				}

				System.out.println();
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
