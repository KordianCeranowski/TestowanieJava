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
        String actual = temp.sing(1);
        assertEquals(expected, actual);
    }

    @Test
    public void dayTwoTest() {
        String expected = "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = temp.sing(2);
        assertEquals(expected, actual);
    }

    @Test
    public void dayTwelfthTest() {
        String expected = "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = temp.sing(12);
        assertEquals(expected, actual);
    }

    @Test
    public void singSection1to5() {
        String expected = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree." +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = temp.singSection(1,5);
        assertEquals(expected, actual);
    }

    @After
    public void tearDown(){
        temp = null;
    }
}
