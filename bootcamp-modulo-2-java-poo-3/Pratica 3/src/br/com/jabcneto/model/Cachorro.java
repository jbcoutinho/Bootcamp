package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.Carnivoro;

public class Cachorro extends Animal implements Carnivoro{

	@Override
	public void EmitirSom() {
		System.out.println("Au au au!");
	}

	@Override
	public void comerCarne() {
		System.out.println("Comendo carne");
	}

}
