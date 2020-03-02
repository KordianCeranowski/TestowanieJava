import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PangramTest {

    Pangram temp;

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



    @After
    public void tearDown(){
        temp = null;
    }
}