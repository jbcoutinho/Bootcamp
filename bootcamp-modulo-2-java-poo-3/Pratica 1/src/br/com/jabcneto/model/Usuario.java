package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.Transacoes;

public class Usuario implements Transacoes {

	@Override
	public void transacaoOk() {
		System.out.println("Transacao realizada com sucesso");
	}

	@Override
	public void transacaoNaoOk() {
		System.out.println("Falha ao realizar transacao");
	}

}
