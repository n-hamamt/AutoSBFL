package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HamamtTest {

    Hamamt obj = new Hamamt();

    @Test
    public void tc1() {
        assertTrue(obj.method(1));
    }

}