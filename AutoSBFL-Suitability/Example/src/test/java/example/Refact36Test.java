package example;


import static org.junit.Assert.*;

import org.junit.Test;

import example.Refact36;

public class Refact36Test {

	@Test
	public void test01() {
		int[] array = {1,2,3,0,5};
		assertEquals(6, new Refact36().method(array));
	}
	
	@Test
	public void test02() {
		int[] array = {1,2,3};
		assertEquals(6, new Refact36().method(array));
	}
	
	@Test
	public void test03() {
		int[] array = {5};
		assertEquals(5, new Refact36().method(array));
	}
	
	@Test
	public void test04() {
		int[] array = {0};
		assertEquals(0, new Refact36().method(array));
	}
	
	@Test
	public void test05() {
		int[] array = {};
		assertEquals(0, new Refact36().method(array));
	}
}
