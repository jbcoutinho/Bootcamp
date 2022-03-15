package br.com.jbcneto.model;

import java.util.Objects;

public class Pessoa {
	private String id;
	private String nome;
	private Integer idade;
	private Double peso;
	private Double altura;

	public Pessoa() {
	}

	public Pessoa(String id, String nome, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String id, String nome, Integer idade, Double peso, Double altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public Integer calculaIMC() {

		double imc = (this.peso.doubleValue() / Math.pow(this.altura, 2));
		System.out.println("IMC: " + imc);
		if (imc < 20) {
			return -1;
		} else if ((imc >= 20) && (imc < 25)) {
			return 0;
		} else if(imc >= 25) {
			return 1;
		}
		return null;

	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
