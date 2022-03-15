package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.TransacoesExecutivo;

public class Executivo extends Usuario implements TransacoesExecutivo{

	@Override
	public void depositar() {
		
		System.out.println("Depositando dinheiro...");
		
	}

	@Override
	public void tranferir() {
		
		System.out.println("Transferindo dinheiro...");
		
	}

	
	
}
