package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.TransacoesBase;

public class Cobrador extends Usuario implements TransacoesBase {

	@Override
	public void sacar() {

		System.out.println("Sacando dinheiro...");

	}

	@Override
	public void consultar() {
		System.out.println("Consultando saldo");

	}

}
