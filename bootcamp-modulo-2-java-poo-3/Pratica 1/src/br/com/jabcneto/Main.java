package br.com.jabcneto;

import br.com.jabcneto.model.Cobrador;
import br.com.jabcneto.model.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario cliente = new Cobrador();
		((Cobrador) cliente).sacar();
		((Cobrador) cliente).consultar();

	}

}
