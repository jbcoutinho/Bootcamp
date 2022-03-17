package br.com.jabcneto.model;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private final String id = UUID.randomUUID().toString();
	private String nome;
	private Integer quantidade;
	private BigDecimal custoUnitario;
}
