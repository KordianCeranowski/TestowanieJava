package lab4.QF;

import lab4.QuadraticFunction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticFunctionJU4Test {
    private QuadraticFunction temp;

    @Test
    public void testFunctionHasTwoZeroPlaces(){
        temp = new QuadraticFunction(2,-6, 4);
        assertNotEquals(temp.getX1(), temp.getX2());
    }

    @Test
    public void testFunctionHasTwoZeroPlaces2(){
        temp = new QuadraticFunction(6,-26, 4);
        assertNotEquals(temp.getX1(), temp.getX2());
    }

    @Test
    public void testLinearFunctionHasOneZeroPlace(){
        temp = new QuadraticFunction(0,26, 4);
        assertEquals(temp.getX1(), temp.getX2(), 0);
    }

    @Test
    public void testFunctionHasOneZeroPlace2(){
        temp = new QuadraticFunction(0,-2, 4);
        assertEquals(temp.getX1(), temp.getX2(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFunctionHasNoZeroPlaces(){
        new QuadraticFunction(2, 0, 1);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFunctionHasNoZeroPlaces2(){
        new QuadraticFunction(20, 10, 100);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstantFunctionOverZeroThrowsException(){
        new QuadraticFunction(0, 0, 1);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstantFunctionOnZeroThrowsException(){
        new QuadraticFunction(0, 0, 0);
        Assert.fail();
    }

}
