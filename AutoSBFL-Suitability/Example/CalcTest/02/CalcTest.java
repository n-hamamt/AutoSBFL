package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
    Calc obj = new Calc();

    @Test
    public void sum01() {
        assertEquals(0, obj.calcMain(0,0,'+'));
    }
    @Test
    public void sum02() {
        assertEquals(3, obj.calcMain(1,2,'+'));
    }
    @Test
    public void diff01() {
        assertEquals(0, obj.calcMain(0,0,'-'));
    }
    @Test
    public void diff02() {
        assertEquals(5, obj.calcMain(11,6,'-'));
    }
    @Test
    public void prod01() {
        assertEquals(0, obj.calcMain(2,0,'*'));
    }
    @Test
    public void prod02() {
        assertEquals(12, obj.calcMain(3,4,'*'));
    }
    @Test
    public void quot01() {
        assertEquals(0, obj.calcMain(0,10,'/'));
    }
    @Test
    public void quot02() {
        assertEquals(4, obj.calcMain(24,6,'/'));
    }
    @Test(expected = ArithmeticException.class)
    public void quotException() {
        obj.calcMain(3,0,'/');
    }
}