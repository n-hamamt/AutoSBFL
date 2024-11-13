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
}