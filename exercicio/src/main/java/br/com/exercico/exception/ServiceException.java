package br.com.exercico.exception;


/**
 * 
 * @author Guilherme
 *
 * Classe que representa uma exceção de negócio.
 *
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	
	public ServiceException(String msg, Throwable e){
		
		super(msg, e);
		
	}
	
	
}
