package br.com.helderfernandes;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class NumberTest {

	public static void construtor() {
		System.out.println("Iniciei a conexão com o banco de dados");
	}
	
	public static void destrutor() {
		System.out.println("Terminei a conexão com o banco de dados");
	}
	
	
	public void initNumber() {
		PositiveNumber number = new PositiveNumber(10);
		System.out.println("Rodou o initNuber");
	}

	@Test
	void testTwoOdd() {
		boolean conexaoFuncionou = false;
		

		System.out.println("Rodei");
		
//		int[] entrada = { 4, 8, 15, 16, 23, 42 };
//		number.setValue(5);
//		boolean[] saida = { false, false, true, false, true, false };
//		assertAll("o nome do conjunto",
//				() -> assertEquals(saida[0], new PositiveNumber(entrada[0]).isOdd(), "primeira linha"),
//				() -> assertEquals(saida[1], new PositiveNumber(entrada[1]).isOdd(), "segunda linha"),
//				() -> assertEquals(saida[2], new PositiveNumber(entrada[2]).isOdd()),
//				() -> assertEquals(saida[3], new PositiveNumber(entrada[3]).isOdd()),
//				() -> assertEquals(saida[4], new PositiveNumber(entrada[4]).isOdd()),
//				() -> assertEquals(saida[5], new PositiveNumber(entrada[5]).isOdd()));

//		for (int indice = 0; indice < entrada.length; indice++) {
//			assertEquals(saida[indice], new PositiveNumber(entrada[indice]).isOdd(),
//					"Falhou para a entrada " + entrada[indice]);
//		}
//		PositiveNumber two = new PositiveNumber(2);
//		assertEquals(false, two.isOdd(), "O número 2 não é ímpar!");
	}

	@Test
	void testNotPositive() {
		// se o número não for positivo, o resultado do isOdd() deve ser null
		PositiveNumber number = new PositiveNumber(-2);
		assertNull(number.isOdd());
		assertEquals(null, number.isOdd()); // tem o mesmo resultado da linha de cima
		System.out.println(number.getValue());
	}

	@Test
	void testNullPointer() {
		PositiveNumber number = new PositiveNumber(null);
		assertThrows(NullPointerException.class, () -> {
			number.isOdd();
		});
	}


}
