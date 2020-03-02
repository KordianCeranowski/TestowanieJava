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
    public void dayTwelfthTestTest() {
        String expected = "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = temp.sing(12);
        assertEquals(expected, actual);
    }

    @Test
    public void singSection1to5Test() {
        String expected = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree." +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = temp.singSection(1,5);
        assertEquals(expected, actual);
    }

    @Test
    public void singAllTest() {
        String expected = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree." +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree." +
                "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
        String actual = temp.singAll();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDayThrowsExceptionTest(){
        temp.sing(30);
        Assert.fail();
    }

    @After
    public void tearDown(){
        temp = null;
    }
}
