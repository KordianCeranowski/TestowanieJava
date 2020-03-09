package lab4.QF;

import lab4.QuadraticFunction;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class QuadraticFunctionJU5Test {
    private QuadraticFunction temp;

    @Test
    void testFunctionHasTwoZeroPlaces(){
        temp = new QuadraticFunction(2,-6, 4);
        assertNotEquals(temp.getX1(), temp.getX2());
    }

    @Test
    void testFunctionHasTwoZeroPlaces2(){
        temp = new QuadraticFunction(6,-26, 4);
        assertNotEquals(temp.getX1(), temp.getX2());
    }

    @Test
    void testLinearFunctionHasOneZeroPlace(){
        temp = new QuadraticFunction(0,26, 4);
        assertEquals(temp.getX1(), temp.getX2(), 0);
    }

    @Test
    void testFunctionHasOneZeroPlace2(){
        temp = new QuadraticFunction(0,-2, 4);
        assertEquals(temp.getX1(), temp.getX2(), 0);
    }

    @Test
    void testFunctionHasNoZeroPlaces(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new QuadraticFunction(2, 0, 1));
    }

    @Test
    void testFunctionHasNoZeroPlaces2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new QuadraticFunction(20, 10, 100));
    }

    @Test
    void testConstantFunctionOverZeroThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new QuadraticFunction(0, 0, 1));
    }

    @Test
    void testConstantFunctionOnZeroThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new QuadraticFunction(0, 0, 0));
    }
}
