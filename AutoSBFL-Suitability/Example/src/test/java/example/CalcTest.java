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
    public void sum04() {
        assertEquals(100, obj.calcMain(36,64,'+'));
    }
    @Test
    public void sum05() {
        assertEquals(1000, obj.calcMain(400,600,'+'));
    }
    @Test
    public void sum03() {
        assertEquals(-5, obj.calcMain(-2,-3,'+'));
    }   //add
    @Test
    public void diff01() {
        assertEquals(0, obj.calcMain(0,0,'-'));
    }
    @Test
    public void diff02() {
        assertEquals(5, obj.calcMain(11,6,'-'));
    }
    @Test
    public void diff03() {
        assertEquals(3, obj.calcMain(-2,-5,'-'));
    }    //add
    @Test
    public void prod01() {
        assertEquals(0, obj.calcMain(2,0,'*'));
    }
    @Test
    public void prod02() {
        assertEquals(12, obj.calcMain(3,4,'*'));
    }
    @Test
    public void prod03() {
        assertEquals(-8, obj.calcMain(2,-4,'*'));
    }   //add
    @Test
    public void quot01() {
        assertEquals(0, obj.calcMain(0,10,'/'));
    }
    @Test
    public void quot02() {
        assertEquals(4, obj.calcMain(24,6,'/'));
    }
    @Test
    public void quot03() {
        assertEquals(-6, obj.calcMain(-30,5,'/'));
    }   //add
    @Test(expected = ArithmeticException.class)
    public void quotException() {
        obj.calcMain(3,0,'/');
    }
}