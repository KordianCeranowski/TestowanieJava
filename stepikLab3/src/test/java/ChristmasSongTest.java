import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ChristmasSongTest {

    ChristmasSong temp;

    @Before
    public void setUp(){
        temp = new ChristmasSong();
    }

    @Test
    public void dayOneTest() {
        String expected = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.";
        String actual = ChristmasSong.sing(1);
        assertEquals(expected, actual);
    }

    @Test
    public void dayTwoTest() {
        String expected = "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = ChristmasSong.sing(2);
        assertEquals(expected, actual);
    }

    @After
    public void tearDown(){
        temp = null;
    }
}