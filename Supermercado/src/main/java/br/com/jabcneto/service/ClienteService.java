package br.com.jabcneto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.jabcneto.interfaces.CRUD;
import br.com.jabcneto.model.Cliente;

public class ClienteService implements CRUD<Cliente> {

	List<Cliente> list = new ArrayList<>();

	public ClienteService(List<Cliente> list) {
		this.list = list;
	}

	@Override
	public void create(Cliente entity) {
		try {
			list.add(entity);
		} catch (Exception e) {
			System.out.println("Falha ao cadastrar cliente: " + e.getMessage());
		}
	}

	@Override
	public void findAll() {
		System.out.println("Listando usuarios na base: ");
		list.forEach(System.out::println);
	}

	@Override
	public Cliente findById(String id) throws RuntimeException {
		boolean anyMatch = list.stream().anyMatch(e -> e.getId().equals(id));
		if (anyMatch) {
			Cliente cliente = list.stream().filter(e -> e.getId().equals(id)).findFirst().get();
			return cliente;
		} else {
			throw new RuntimeException("Cliente nao encotrado tente outro id!");
		}
	}

	@Override
	public void update(String id, Cliente entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		Optional<Cliente> optional = this.list.stream().filter(e -> e.getId().equals(id)).findAny();

		if (optional.isPresent()) {
			this.list.remove(optional.get());
			System.out.println("Cliente com id " + id + " removido com sucesso!");
		} else {
			System.out.println("Cliente nao encotrado tente outro id!");
		}
	}

}
