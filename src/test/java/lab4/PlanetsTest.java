package lab4;

import lab3.Planets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class PlanetsTest {

    private Planets temp;
    private double delta;

    @BeforeEach
    void setUp(){
        temp = new Planets();
        delta = 0.002;
    }

    @Test
    void testCalculateTimeOnEarth(){
        double expected = 31.69;
        double actual = temp.CalculateAge(1000000000, "Ziemia");
        assertEquals(expected, actual, delta);
    }

    @Test
    void testCalculateTimeOnWenus(){
        double expected = 51.51;
        double actual = temp.CalculateAge(1000000000, "Wenus");
        assertEquals(expected, actual, delta);
    }

    @Test
    void testCalculateTimeOnMercury(){
        double expected = 280.88;
        double actual = temp.CalculateAge(2134835688, "Merkury");
        assertEquals(expected, actual, delta);
    }

    @Test
    void testCalculateTimeOnMercuryWithTooSmallDelta(){
        double expected = 280.88;
        double actual = temp.CalculateAge(2134835688, "Merkury");
        double localDelta = 0.0001;
        assertNotEquals(expected, actual, localDelta);
    }

    @AfterEach
    void tearDown(){
        temp = null;
    }
}