package br.com.exercicio.service.test;

import org.junit.Test;

import br.com.exercico.model.Rota;
import br.com.exercico.service.RotaService;


/**
 * 
 * Clase de teste para a service de Rotas.
 * 
 * @author Guilherme
 *
 */
public class RotaServiceTest {

	
	private RotaService service = new RotaService();
	
	@Test
	public void testCadastrarRota(){
		
		Rota rota = new Rota("BH","SP",580);
		
		service.cadastrarRota(rota);
		
		
	}
	
	
	

}
