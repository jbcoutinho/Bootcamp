package br.com.mercadolivre;

public class Pereciveis extends Produto {

	private Integer diasParaVencer;

	public Pereciveis(String nome, Double preco, Integer diasParaVencer) {
		super.setNome(nome);
		super.setPreco(preco);
		this.diasParaVencer = diasParaVencer;
	}

	@Override
	public double calcular(int qtdProd) {
		if (diasParaVencer.equals(1)) {
			return super.calcular(qtdProd) / 4;
		} else if (diasParaVencer.equals(2)) {
			return super.calcular(qtdProd) / 3;
		} else if (diasParaVencer.equals(3)) {
			return super.calcular(qtdProd) / 2;
		} else {
			return super.calcular(qtdProd);
		}
	}

}
