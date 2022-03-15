package br.com.jabcneto.models;

import java.util.List;

import br.com.jabcneto.DocTypes;

public class Curriculo extends Arquivo{
	
	private String pessoa;
	private List<String> habilidades;
	
	public Curriculo() {
		super(DocTypes.CURRICULO);
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

}
