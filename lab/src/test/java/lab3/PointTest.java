package lab3;

import lab3.Point;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    private Point pointOne, pointTwo;

    @Before
    public void setUp(){
        pointOne = new Point(1,1);
        pointTwo = new Point(4,5);
    }

    @Test
    public void testTranslatePoint_1_1(){
        Point expected = new Point(3,4);
        Point actual = pointOne.translate(2,3);
        assertEquals(expected, actual);
    }

    @Test
    public void testTranslatePoint_4_5(){
        Point expected = new Point(6,8);
        Point actual = pointTwo.translate(2,3);
        assertEquals(expected, actual);
    }

    @Test
    public void testScalePoint_1_1(){
        Point expected = new Point(3,3);
        Point actual = pointOne.scale(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testScalePoint_4_5(){
        Point expected = new Point(12,15);
        Point actual = pointTwo.scale(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testShowPoint_1_1(){
        assertEquals("1.0 1.0", pointOne.show());
    }

    @Test
    public void testShowPoint_4_5(){
        assertEquals("4.0 5.0", pointTwo.show());
    }

    @Test(expected = AssertionError.class)
    public void testScalingWithTooBigValuesThrowsException(){
        Point point = new Point(Double.MAX_VALUE, Double.MAX_VALUE);
        point.scale(Double.MAX_VALUE);
        Assert.fail();
    }

    @After
    public void tearDown(){
        pointOne = null;
    }
}