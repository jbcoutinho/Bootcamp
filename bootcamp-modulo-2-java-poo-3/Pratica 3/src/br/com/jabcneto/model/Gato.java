package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {

	@Override
	public void EmitirSom() {
		System.out.println("Miau miau miau!");
	}
	
	@Override
	public void comerCarne() {
		System.out.println("Comendo carne");
	}

}
