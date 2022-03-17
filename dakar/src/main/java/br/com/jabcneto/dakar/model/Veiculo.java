package br.com.jabcneto.dakar.model;

import lombok.Data;

@Data
public class Veiculo {
	private Integer velocidade;
	private Integer aceleracao;
	private Integer anguloGiro;
	private String placa;
	private Integer peso;
	private Integer rodas;
}
