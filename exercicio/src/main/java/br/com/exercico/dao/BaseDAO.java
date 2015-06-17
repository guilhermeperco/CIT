package br.com.exercico.dao;

import java.util.List;

import br.com.exercico.model.BaseModel;
import br.com.exercico.model.Rota;


/**
 * Classe abstrata que fornece as funcionalidades bascicas de percistencia (CRUD).
 * 
 * @author Guilherme
 *
 * @param <T> qualquer objeto que extenda Model
 * 
 * @see br.com.exercico.model.BaseModel
 */
public abstract class BaseDAO<T extends BaseModel> implements DAO<T> {

	
	/**
	 * insere um novo registro na base de dados.
	 */
	public void insert(T model) {
		// TODO Auto-generated method stub

	}

	/**
	 * Atualiza o restro na base de dados.
	 * 
	 */
	public void update(T model) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * Lista todos os registros encontrados na base de dadaos da tabela mapeada pela entidade T 
	 * 
	 */
	public List<T> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Execura um query na base de dados com base nos atributos do objeto passado como parametro.
	 * @param model Alguma implemantação de BaseModel
	 * @return Lista de objetos encontratos na base de dados
	 */
	public List<T> listByExemple(T model) {
		// TODO Auto-generated method stub
		return null;
	}

}
