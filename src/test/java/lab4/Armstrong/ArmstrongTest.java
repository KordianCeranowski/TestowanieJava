package lab4.Armstrong;

import lab3.Armstrong;

import org.junit.jupiter.api.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


class ArmstrongTest {

    private static Armstrong temp;

    @BeforeAll
    static void setUp(){
        temp = new Armstrong();
    }

    @Test
    void testNegative15ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("-15"));
    }

    @Test
    void testNegative9ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("-9"));
    }

    @Test
    void test10ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("10"));
    }

    @Test
    void test11ReturnsFalse(){
        assertFalse(temp.IsArmstrongNumber("11"));
    }

    @Test
    void test9ReturnsTrue(){
        assertTrue(temp.IsArmstrongNumber("9"));
    }

    @Test
    void test8ReturnsTrue(){
        assertTrue(temp.IsArmstrongNumber("8"));
    }

    @Test
    void testTextThrowsException(){
        Assertions.assertThrows(NumberFormatException.class, () -> temp.IsArmstrongNumber("Hello World"));
    }

    @Test
    void testTextWithDigitsThrowsException(){
        Assertions.assertThrows(NumberFormatException.class, () -> temp.IsArmstrongNumber("G00dby3 W0r1d :("));
    }

    @AfterAll
    static void tearDown(){
        temp = null;
    }
}