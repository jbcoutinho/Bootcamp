package br.com.jabcneto;

import br.com.jabcneto.interfaces.Impressora;
import br.com.jabcneto.models.Curriculo;
import br.com.jabcneto.models.Pdf;
import br.com.jabcneto.models.Relatorio;

public class Main {

	public static void main(String[] args) {

		Impressora.imprimir(new Pdf());

		Impressora.imprimir(new Curriculo());

		Impressora.imprimir(new Relatorio());
		
	}

}
