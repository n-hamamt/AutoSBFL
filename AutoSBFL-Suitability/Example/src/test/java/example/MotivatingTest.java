package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotivatingTest {

	Motivating obj = new Motivating();
	
//  // for 01/02
	@Test
	public void tc1() {
		assertTrue(obj.method(1, 1));
	}
	
	@Test
	public void tc2() {
		assertTrue(obj.method(1, 0));
	}
	
//	@Test
//	public void tc3() {
//		assertTrue(obj.method(1, -1));
//	}
	
	@Test
	public void tc4() {
		assertTrue(obj.method(0, 1));
	}

	@Test
	public void tc5() {
		assertFalse(obj.method(0, 0));
	}
//	
//	@Test
//	public void tc6() {
//		assertFalse(obj.method(0, -1));
//	}
//	
//	@Test
//	public void tc7() {
//		assertTrue(obj.method(-1, 1));
//	}
//	
//	@Test
//	public void tc8() {
//		assertFalse(obj.method(-1, 0));
//	}
//	
//	@Test
//	public void tc9() {
//		assertFalse(obj.method(-1, -1));
//	}
	
//	// for 03/04
//	@Test
//	public void tc1() {
//		assertEquals("Negative", obj.method(-1));
//	}
//	
//	@Test
//	public void tc2() {
//		assertEquals("Zero", obj.method(0));
//	}
//	
//	@Test
//	public void tc3() {
//		assertEquals("Positive", obj.method(1));
//	}
	
//	// for 05/06
//	@Test
//	public void tc1() {
//		assertEquals(1, obj.method(5 , 3));
//	}
//	
//	@Test
//	public void tc2() {
//		assertEquals(-1, obj.method(3 , 5));
//	}
//	
//	@Test
//	public void tc3() {
//		assertEquals(0, obj.method(3 , 3));
//	}
}
