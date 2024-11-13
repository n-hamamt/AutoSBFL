package example;

import static org.junit.Assert.*;

import org.junit.Test;

import example.Refact33;

public class Refact33Test {
	@Test
	public void test01() {
		assertEquals(9, new Refact33().method(10));
	}

	@Test
	public void test02() {
		assertEquals(0, new Refact33().method(1));
	}

	@Test
	public void test03() {
		assertEquals(0, new Refact33().method(0));
	}

	@Test
	public void test04() {
		assertEquals(-9, new Refact33().method(-10));
	}

	@Test
	public void test05() {
		assertEquals(0, new Refact33().method(-1));
	}
}
