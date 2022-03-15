package br.com.jbcoutinho.model;

public class Participante {

	private String rg;
	private String nome;
	private String sobrenome;
	private Integer idade;
	private String celular;
	private String numeroEmergencia;
	private String grupoSanguineo;
	
	
	public Participante() {
	}

	public Participante(String rg, String nome, String sobrenome, Integer idade, String celular, String numeroEmergencia,
			String grupoSanguineo) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.celular = celular;
		this.numeroEmergencia = numeroEmergencia;
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNumeroEmergencia() {
		return numeroEmergencia;
	}

	public void setNumeroEmergencia(String numeroEmergencia) {
		this.numeroEmergencia = numeroEmergencia;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	@Override
	public String toString() {
		return "[rg=" + rg + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade
				+ ", celular=" + celular + ", numeroEmergencia=" + numeroEmergencia + ", grupoSanguineo="
				+ grupoSanguineo + "]";
	}
	
	

}
