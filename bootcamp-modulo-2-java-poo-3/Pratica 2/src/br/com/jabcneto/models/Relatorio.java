package br.com.jabcneto.models;

import br.com.jabcneto.DocTypes;

public class Relatorio extends Arquivo {

	private String texto;
	private Integer quantidadePaginas;
	private String autor;
	private String revisor;

	public Relatorio() {
		super(DocTypes.RELATORIO);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(Integer quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getRevisor() {
		return revisor;
	}

	public void setRevisor(String revisor) {
		this.revisor = revisor;
	}

}
