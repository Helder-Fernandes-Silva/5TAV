package testeUnitario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadoraTest.Calculadora;

class CalculadoraTest {

	@Test
	void testSomar() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calculadora.somar(4, 6);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testSub() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 5;
		
		int resultado = calculadora.sub(15, 10);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testMult() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 25;
		
		int resultado = calculadora.mult(5, 5);
		
		//System.out.println(resultado);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testDiv() {
		Calculadora calculadora = new Calculadora();
		float resultadoEsperado = 5;
		
		float resultado = calculadora.div(50, 10);
		
		//System.out.println(resultado);
		
		assertEquals(resultadoEsperado, resultado);
	}
}
