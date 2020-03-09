package lab4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void testFunctionHasNoZeroPlaces(){

    }

    @Test
    public void testFunctionHasNoZeroPlaces2(){

    }

}
