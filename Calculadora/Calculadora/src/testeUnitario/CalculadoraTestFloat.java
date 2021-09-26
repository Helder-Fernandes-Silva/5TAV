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

}
