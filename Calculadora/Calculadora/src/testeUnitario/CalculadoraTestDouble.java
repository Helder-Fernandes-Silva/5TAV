package testeUnitario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculadoraTest.CalculadoraDouble;

class CalculadoraTestDouble {

	@Test
	void testSomar() {
		CalculadoraDouble calculadora = new CalculadoraDouble();
		double resultadoEsperado = 10.7;
		
		double resultado = calculadora.somar(4.5, 6.2);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testSub() {
		CalculadoraDouble calculadora = new CalculadoraDouble();
		double resultadoEsperado = 4.75;
		
		double resultado = calculadora.sub(15.5, 10.75);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testMult() {
		CalculadoraDouble calculadora = new CalculadoraDouble();
		double resultadoEsperado = 90.06;
		
		double resultado = calculadora.mult(5.7, 15.8);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testDiv() {
		CalculadoraDouble calculadora = new CalculadoraDouble();
		double resultadoEsperado = 2.0;
		
		double resultado = calculadora.div(10.0, 5.0);
		
		assertEquals(resultadoEsperado, resultado);
	}

}
