package br.com.jabcneto.models;

import br.com.jabcneto.DocTypes;

public class Arquivo {
	private DocTypes tipo;

	public Arquivo() {
	}
	
	public Arquivo(DocTypes tipo) {
		this.tipo = tipo;
	}

	public DocTypes getTipo() {
		return tipo;
	}

	public void setTipo(DocTypes tipo) {
		this.tipo = tipo;
	}

}
