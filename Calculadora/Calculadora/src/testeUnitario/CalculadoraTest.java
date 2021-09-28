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
	
	@Test
	void testPot() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 8;
		
		int resultado = calculadora.expo(2, 3);
		
		//System.out.println(resultado);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testRaizQ() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 5;
		
		int resultado = calculadora.raizQ(25);
		
		//System.out.println(resultado);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testRaizC() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 2;
		
		int resultado = calculadora.raizCub(8);
		
		//System.out.println(resultado);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testPorct() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calculadora.porcent(10, 100);
		
		System.out.println(resultado);
		
		assertEquals(resultadoEsperado, resultado);
	}
}
