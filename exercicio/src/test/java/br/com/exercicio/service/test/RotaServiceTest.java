package br.com.exercicio.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.exercico.model.EntradaCalculoRota;
import br.com.exercico.model.Rota;
import br.com.exercico.model.RotaEntrega;
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
	List<Rota> mapa;
	@Before
	public void prepare(){
		mapa = new ArrayList<Rota>();
		
		mapa.add(new Rota("A","B",5d));
		mapa.add(new Rota("B","C",10d));
		mapa.add(new Rota("C","D",25d));
		mapa.add(new Rota("D","E",12d));
	    mapa.add(new Rota("A","E",10d));
		
		service.cadastrarMapaRotas(mapa);
	}
	
	@Test
	public void testeRotaAtoB(){		
		
		EntradaCalculoRota entrada = new EntradaCalculoRota();
		entrada.setOrigem("A");
		entrada.setDestino("B");
		entrada.setAutonomia(10d);
		entrada.setValorCombustivel(2.50d);
		
		RotaEntrega entrega = service.calcularRotaEntrega(entrada);
		 
		Assert.assertEquals("De A ate D o custo deve ser 1,25", 1.25d, entrega.getCusto(),0d);
		
		
		
	}
	
	
	@Test
	public void testeRotaAtoD(){		
		
		EntradaCalculoRota entrada = new EntradaCalculoRota();
		entrada.setOrigem("A");
		entrada.setDestino("D");
		entrada.setAutonomia(10d);
		entrada.setValorCombustivel(2.50d);
		
		RotaEntrega entrega = service.calcularRotaEntrega(entrada);
		 
		Assert.assertEquals("De A ate B o custo deve ser 1,25", 10.0d, entrega.getCusto(),0d);
		
		
		
	}
	
	
	@Test
	public void testeRotaAtoE(){		
		
		EntradaCalculoRota entrada = new EntradaCalculoRota();
		entrada.setOrigem("A");
		entrada.setDestino("E");
		entrada.setAutonomia(10d);
		entrada.setValorCombustivel(2.50d);
		
		RotaEntrega entrega = service.calcularRotaEntrega(entrada);
		 
		Assert.assertEquals("De A ate E o custo deve ser 1,25", 2.5d, entrega.getCusto(),0d);
		
		
	}
	
	
	

}
