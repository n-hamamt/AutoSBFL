package example;


import static org.junit.Assert.*;

import org.junit.Test;

import example.Refact35;

public class Refact35_01Test {

	@Test
	public void test01() {
		assertEquals(0, new Refact35_01().method(1, 0));
	}
	
	@Test
	public void test02() {
		assertEquals(3, new Refact35_01().method(1, 1));
	}
	
	@Test
	public void test03() {
		assertEquals(0, new Refact35_01().method(0, 0));
	}
	
	@Test
	public void test04() {
		assertEquals(4, new Refact35_01().method(0, 1));
	}
	
	@Test
	public void test05() {
		assertEquals(0, new Refact35_01().method(-1, 0));
	}
	
	@Test
	public void test06() {
		assertEquals(4, new Refact35_01().method(-1, 1));
	}
	
}
