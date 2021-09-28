package testeUnitario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadoraTest.CalculadoraFloat;

class CalculadoraTestFloat {

	@Test
	void testSomar() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 10.7f;
		
		float resultado = calculadora.somar(4.5f, 6.2f);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testSub() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 4.75f;
		
		float resultado = calculadora.sub(15.5f, 10.75f);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testMult() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 30.25f;
		
		float resultado = calculadora.mult(5.5f, 5.5f);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testDiv() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 2.0f;
		
		float resultado = calculadora.div(20.0f, 10.0f);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testPot() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 8f;
		
		float resultado = calculadora.expo(2f, 3f);
		
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testRaizQ() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 5f;
		
		float resultado = calculadora.raizQ(25f);
		
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testRaizC() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 2f;
		
		float resultado = calculadora.raizCub(8f);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testPorct() {
		CalculadoraFloat calculadora = new CalculadoraFloat();
		float resultadoEsperado = 10f;
		
		float resultado = calculadora.porcent(10f, 100f);
		
		assertEquals(resultadoEsperado, resultado);
	}

}
