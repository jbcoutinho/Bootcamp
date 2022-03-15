package br.com.jabcneto.model;

import br.com.jabcneto.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
	
	@Override
	public void EmitirSom() {
		System.out.println("Mu mu mu!");
	}

	@Override
	public void comerPasto() {
		System.out.println("Comendo pasto");
	}

}
