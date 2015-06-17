package br.com.exercico.exception;


/**
 * 
 * @author Guilherme
 *
 * Classe que representa uma exce��o de neg�cio.
 *
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	
	public ServiceException(String msg, Throwable e){
		
		super(msg, e);
		
	}
	
	
}
