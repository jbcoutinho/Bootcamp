package br.com.jabcneto.models;

import br.com.jabcneto.DocTypes;

public class Pdf extends Arquivo {
	private Integer paginas;
	private String autor;
	private String titulo;
	private String genero;
	
	

	public Pdf() {
		super(DocTypes.PDF);
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
