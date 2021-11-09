package br.com.helderfernandes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person();
		assertEquals("hello", person.hello());
	}

}
