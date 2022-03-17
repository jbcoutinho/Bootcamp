package br.com.jabcneto.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fatura {

	private Cliente cliente;
	private List<Item> items = new ArrayList<>();
	private BigDecimal total = BigDecimal.ZERO;

	public Fatura(Cliente cliente, List<Item> items) {
		this.cliente = cliente;
		this.items = items;
		this.total = calculaFatura();
	}

	public BigDecimal calculaFatura() {
		return items.stream().reduce(BigDecimal.ZERO,
				(sub, atual) -> sub.add(atual.getCustoUnitario().multiply(BigDecimal.valueOf(atual.getQuantidade()))),
				BigDecimal::add);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n------------------------------------------\n");
		sb.append("Olá " + this.cliente.getNome() + " " + this.cliente.getSobrenome());
		sb.append("\n------------------------------------------\n");
		items.forEach(item -> sb
				.append(item.getNome() + " - " + item.getQuantidade() + "x R$" + item.getCustoUnitario() + "\n"));
		sb.append("Total: " + calculaFatura());
		sb.append("\n------------------------------------------\n");
		return sb.toString();
	}

}
