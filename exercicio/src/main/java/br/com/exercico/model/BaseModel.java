package br.com.exercico.model;

import java.io.Serializable;


/**
 * Classe que fornece uma abstra��o para os objetos do pacote Model.
 * 
 *  As classes que extendem de Model poder�o ser usadas em toddas as 
 *  camadas da aplica��o como DAO, Service, etc.
 *  
 *  
 * @author Guilherme
 *
 */
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

}
