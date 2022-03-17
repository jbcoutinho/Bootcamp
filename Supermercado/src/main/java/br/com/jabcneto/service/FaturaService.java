package br.com.jabcneto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.jabcneto.interfaces.CRUD;
import br.com.jabcneto.model.Cliente;
import br.com.jabcneto.model.Fatura;

public class FaturaService implements CRUD<Fatura> {

	List<Fatura> list = new ArrayList<>();
	List<Cliente> clientes = new ArrayList<>();

	public FaturaService(List<Fatura> list, List<Cliente> clientes) {
		this.list = list;
		this.clientes = clientes;
	}

	@Override
	public void create(Fatura entity) {
		if(!entity.getItems().isEmpty())
			list.add(entity);
	}

	@Override
	public Fatura findById(String id) {
		return null;
	}
	
	public List<Fatura> findByClientId(String id) {
		List<Fatura> faturas = list.stream().filter(e -> e.getCliente().getId().equals(id)).collect(Collectors.toList());
		return faturas;
	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String id, Fatura entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
