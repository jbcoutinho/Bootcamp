package br.com.jabcneto.interfaces;

public interface CRUD <T>{
	
	void create(T entity);
	T findById(String id);
	void findAll();
	void update(String id, T entity);
	void delete(String id);

}
