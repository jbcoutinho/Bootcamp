package br.com.jbcoutinho.model;

import java.util.HashMap;
import java.util.Map;

public class Categoria {
	private NomeCategoria nome;
	private String distancia;
	private String descricao;
	private Map<Integer, Participante> partiticipantes = new HashMap<>();

	public Categoria(NomeCategoria nome, String distancia, String descricao) {
		this.nome = nome;
		this.distancia = distancia;
		this.descricao = descricao;
	}

	public void registraParticipante(Participante participante) {
		this.validaIdade(participante);
		this.partiticipantes.put(this.partiticipantes.size() + 1, participante);
	}

	public void calculaCustoInscricao(Participante participante) {
		switch (this.nome) {
		case CIRCUITO_PEQUENO:
			if (participante.getIdade() <= 18) {
				System.out.println("Custo de inscricao: R$" + 1300);
				break;
			} else {
				System.out.println("Custo de inscricao: R$" + 1500);
				break;
			}
		case CIRCUITO_MEDIO:
			if (participante.getIdade() <= 18) {
				System.out.println("Custo de inscricao: R$" + 2000);
				break;
			} else {
				System.out.println("Custo de inscricao: R$" + 2300);
				break;
			}
		case CIRCUITO_AVANCADO:
			if (this.validaIdade(participante)) {
				System.out.println("Custo de inscricao: R$" + 2800);
			}
			break;
		default:
			System.out.println("Categoria nao encontrada!");
			break;
		}
	}

	public void cancelaInscricao(Integer numeroInscricao) {
		if (this.partiticipantes.containsKey(numeroInscricao)) {
			this.partiticipantes.remove(numeroInscricao);
		} else {
			System.out.println("Inscricao nao encontrada!");
		}
	}

	private boolean validaIdade(Participante participante) {
		if (participante.getIdade() < 18 && this.nome.equals(NomeCategoria.CIRCUITO_AVANCADO)) {
			System.out.println("Participante deve ter ao menos 18 anos!");
			return false;
		}
		return true;
	}

	public NomeCategoria getNome() {
		return nome;
	}

	public void setNome(NomeCategoria nome) {
		this.nome = nome;
	}

	public Map<Integer, Participante> getPartiticipantes() {
		return partiticipantes;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
