package br.com.helderfernandes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParImparTest {

	@Test
	public void test() {
		ParImpar num = new ParImpar(1);
		assertEquals(false, num.ePar());
	}

	@Test
	public void test2() {
		ParImpar num = new ParImpar(1);
		assertEquals(true, num.ePar());
	}
}
