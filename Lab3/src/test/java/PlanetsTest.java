import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlanetsTest {

    private Planets temp;
    private double delta;

    @Before
    public void setUp(){
        temp = new Planets();
        delta = 0.002;
    }

    @Test
    public void testCalculateTimeOnEarth(){
        double expected = 31.69;
        double actual = temp.CalculateAge(1000000000, "Ziemia");
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateTimeOnWenus(){
        double expected = 51.51;
        double actual = temp.CalculateAge(1000000000, "Wenus");
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateTimeOnMercury(){
        double expected = 280.88;
        double actual = temp.CalculateAge(2134835688, "Merkury");
        assertEquals(expected, actual, delta);
    }

    // To jest test który "nie przechodzi"
    @Test
    public void testCalculateTimeOnMercuryWithTooSmallDelta(){
        double expected = 280.88;
        double actual = temp.CalculateAge(2134835688, "Merkury");
        double localDelta = 0.0001;
        assertNotEquals(expected, actual, localDelta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongPlanetThrowsException(){
        temp.CalculateAge(2134835688, "NonExistentPlanet");
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeTimeThrowsException(){
        temp.CalculateAge(-15, "Merkury");
        Assert.fail();
    }

    @After
    public void tearDown(){
        temp = null;
    }
}