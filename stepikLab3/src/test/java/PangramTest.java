import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PangramTest {

    private Pangram temp;

    @Before
    public void setUp(){
        temp = new Pangram();
    }

    @Test
    public void testSamplePangram(){
        assertTrue(temp.check("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void testSampleNonPangram(){
        assertFalse(temp.check("This is not a pangram"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDigitInTextThrowsException(){
        temp.check("test123test");
        Assert.fail();
    }

    @Test
    public void testCheckList(){
        List<String> input = new ArrayList<String>();
        input.add("The quick brown fox jumps over the lazy dog");
        input.add("This is not a pangram");
        List<Boolean> expected = new ArrayList<Boolean>();
        expected.add(true);
        expected.add(false);

        assertEquals(expected, temp.checkList(input));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDigitInTextInListThrowsException(){
        List<String> input = new ArrayList<String>();
        input.add("The quick brown fox jumps over the lazy dog");
        input.add("This is not a pangram");
        input.add("test123test");
        temp.checkList(input);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInListThrowsException(){
        List<String> input = new ArrayList<String>();
        input.add("The quick brown fox jumps over the lazy dog");
        input.add(null);
        input.add("This is not a pangram");
        temp.checkList(input);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStringInListThrowsException(){
        List<String> input = new ArrayList<String>();
        input.add("The quick brown fox jumps over the lazy dog");
        input.add("");
        input.add("This is not a pangram");
        temp.checkList(input);
        Assert.fail();
    }

    @After
    public void tearDown(){
        temp = null;
    }
}