package br.com.exercico.dao;

import java.util.List;

import br.com.exercico.model.BaseModel;

public interface DAO<T extends BaseModel> {

	void insert(T model);
	
	void update(T model);
	
	List<T> listAll();
	
	List<T> listByExemple(T model);
	
	
	
}
