package freteTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import frete.Frete;

public class FreteTeste {

	@Test
	public void testCalculaFreteRio() {
		// Arrange
		Frete frete = new Frete();
		String cep = "20000";
		double esperado = 10.0;
		
		// Act
		double resultado = frete.CalculaFreteNacional(cep);
		
		// Assert
		Assert.assertEquals(esperado, resultado, 0.01);
	}
	
	@Test
	public void testCalculaFreteOutro() {
		// Arrange
		Frete frete = new Frete();
		String cep = "50000";
		double esperado = 15.0;
		
		// Act
		double resultado = frete.CalculaFreteNacional(cep);
		
		// Assert
		Assert.assertEquals(esperado, resultado, 0.01);
	}
	
	@Test
	public void testCalculaFreteIntl() {
		// Arrange
		Frete frete = new Frete();
		String pais = "US";
		double esperado = 15.0;
		
		// Act
		double resultado = frete.CalculaFreteIntl(pais);
		
		// Assert
		Assert.assertEquals(esperado, resultado, 0.01);	
	}
}
