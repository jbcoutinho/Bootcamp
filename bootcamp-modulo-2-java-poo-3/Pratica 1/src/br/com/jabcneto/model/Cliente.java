package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.TransacoesBase;
import br.com.jabcneto.interfaces.TransacoesServico;

public class Cliente extends Usuario implements TransacoesBase, TransacoesServico {

	@Override
	public void sacar() {
		System.out.println("Sou cliente basico e estou sacando dinheiro...");
		
	}

	@Override
	public void consultar() {
		System.out.println("Sou cliente basico e estou consultando meu saldo...");
		
	}

	@Override
	public void pagar() {

		System.out.println("Sou cliente basico e estou pagando servicos da conta...");
		
	}

}
