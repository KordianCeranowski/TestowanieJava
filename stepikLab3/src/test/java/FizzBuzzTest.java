import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    FizzBuzz temp;

    @Before
    public void setUp(){
        temp = new FizzBuzz();
    }

    @Test
    public void testPrint3ReturnsFizz(){
        assertEquals("Fizz",temp.print(3));
    }

    @Test
    public void testPrint9ReturnsFizz(){
        assertEquals("Fizz",temp.print(9));
    }

    @Test
    public void testPrint5ReturnsBuzz(){
        assertEquals("Buzz",temp.print(5));
    }

    @Test
    public void testPrint20ReturnsBuzz(){
        assertEquals("Buzz",temp.print(20));
    }

    @Test
    public void testPrint15ReturnsFizzBuzz(){
        assertEquals("FizzBuzz",temp.print(15));
    }

    @Test
    public void testPrint30ReturnsFizzBuzz(){
        assertEquals("FizzBuzz",temp.print(30));
    }

    @Test
    public void testPrint32ReturnsString32(){
        assertEquals("32",temp.print(32));
    }

    @Test
    public void testPrint34ReturnsString34(){
        assertEquals("34",temp.print(34));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintNegativeValueThrowsException(){
        temp.print(-15);
        Assert.fail();
    }

    @After
    public void tearDown(){
        temp = null;
    }
}