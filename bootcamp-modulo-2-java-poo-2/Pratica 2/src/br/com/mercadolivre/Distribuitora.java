package br.com.mercadolivre;

import java.util.ArrayList;

public class Distribuitora {
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(new Pereciveis("Frango", 20.00, 3));
		produtos.add(new Pereciveis("Ovo", 30.00, 2));
		produtos.add(new Pereciveis("Carne", 40.00, 1));
		produtos.add(new NaoPerecivel("PC", 10.00, "Eletronico"));

		for (Produto produto : produtos) {
			System.out.println(produto.calcular(5));
		}

	}
}
