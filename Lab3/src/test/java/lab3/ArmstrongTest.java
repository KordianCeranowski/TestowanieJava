package lab3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ArmstrongTest {

    private Armstrong temp;

    @Before
    public void setUp(){
        temp = new Armstrong();
    }

    @Test
    public void testNegative15ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("-15"));
    }

    @Test
    public void testNegative9ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("-9"));
    }

    @Test
    public void test10ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("10"));
    }

    @Test
    public void test11ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("11"));
    }

    @Test
    public void test9ReturnsTrue(){
        assertTrue(temp.IsArmstrongNumber("9"));
    }

    @Test
    public void test8ReturnsTrue(){
        assertTrue(temp.IsArmstrongNumber("8"));
    }

    @Test(expected = NumberFormatException.class)
    public void testTextThrowsException(){
        temp.IsArmstrongNumber("Hello World");
        Assert.fail();
    }

    @Test(expected = NumberFormatException.class)
    public void testTextWithDigitsThrowsException(){
        temp.IsArmstrongNumber("G00dby3 W0r1d :(");
        Assert.fail();
    }

    @After
    public void tearDown(){
        temp = null;
    }
}