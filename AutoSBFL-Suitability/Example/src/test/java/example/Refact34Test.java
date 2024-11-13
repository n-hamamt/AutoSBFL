package example;


import static org.junit.Assert.*;

import org.junit.Test;

import example.Refact34;

public class Refact34Test {
	@Test
	public void test01() {
		assertEquals(10, new Refact34().method(1,1,0));
	}
	@Test
	public void test02() {
		assertEquals(10, new Refact34().method(1,0,0));
	}
	@Test
	public void test03() {
		assertEquals(10, new Refact34().method(1,-1,0));
	}
	@Test
	public void test04() {
		assertEquals(10, new Refact34().method(0,1,0));
	}
	@Test
	public void test05() {
		assertEquals(10, new Refact34().method(0,0,0));
	}
	@Test
	public void test06() {
		assertEquals(10, new Refact34().method(0,-1,0));
	}
	@Test
	public void test07() {
		assertEquals(10, new Refact34().method(-1,1,0));
	}
	@Test
	public void test08() {
		assertEquals(10, new Refact34().method(-1,0,0));
	}
	@Test
	public void test09() {
		assertEquals(10, new Refact34().method(-1,-1,0));
	}
	
	
	@Test
	public void test10() {
		assertEquals(10, new Refact34().method(1,1,1));
	}
	@Test
	public void test11() {
		assertEquals(10, new Refact34().method(1,0,1));
	}
	@Test
	public void test12() {
		assertEquals(10, new Refact34().method(1,-1,1));
	}
	@Test
	public void test13() {
		assertEquals(20, new Refact34().method(0,1,1));
	}
	@Test
	public void test14() {
		assertEquals(20, new Refact34().method(0,0,1));
	}
	@Test
	public void test15() {
		assertEquals(10, new Refact34().method(0,-1,1));
	}
	@Test
	public void test16() {
		assertEquals(20, new Refact34().method(-1,1,1));
	}
	@Test
	public void test17() {
		assertEquals(20, new Refact34().method(-1,0,1));
	}
	@Test
	public void test18() {
		assertEquals(10, new Refact34().method(-1,-1,1));
	}
}
