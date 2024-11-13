package example;


import static org.junit.Assert.*;

import org.junit.Test;

import example.Refact37;

public class Refact37Test {

	@Test
	public void test01() {
		assertEquals(-10, new Refact37().method(1,1));
	}
	
	@Test
	public void test02() {
		assertEquals(-10, new Refact37().method(1,0));
	}
	
	@Test
	public void test03() {
		assertEquals(-10, new Refact37().method(1,-1));
	}
	
	@Test
	public void test04() {
		assertEquals(-20, new Refact37().method(0,1));
	}
	
	@Test
	public void test05() {
		assertEquals(-30, new Refact37().method(0,0));
	}
	
	@Test
	public void test06() {
		assertEquals(-30, new Refact37().method(0,-1));
	}
	
	@Test
	public void test07() {
		assertEquals(-20, new Refact37().method(-1,1));
	}
	
	@Test
	public void test08() {
		assertEquals(-30, new Refact37().method(-1,0));
	}
	
	@Test
	public void test09() {
		assertEquals(-30, new Refact37().method(-1,-1));
	}
}
