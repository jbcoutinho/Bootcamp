package br.com.jabcneto.interfaces;

import br.com.jabcneto.models.Arquivo;

public interface Impressora {
	
	public static void imprimir(Arquivo a) {
		switch (a.getTipo()) {
		case PDF:
			System.out.println("Imprimindo PDF");
			break;
		case CURRICULO:
			System.out.println("Imprimindo CURRICULO");
			break;
		case RELATORIO:
			System.out.println("Imprimindo RELATORIO");
			break;

		default:
			break;
		}
	}

}
