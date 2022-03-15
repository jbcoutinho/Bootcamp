package br.com.mercadolivre;

public class NaoPerecivel extends Produto {
	private String tipo;

	public NaoPerecivel(String nome, Double preco, String tipo) {
		super.setNome(nome);
		super.setPreco(preco);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NaoPerecivel [tipo=" + tipo + "nome=" + super.getNome() + ", preco=" + super.getPreco() + "]";
	}

}
