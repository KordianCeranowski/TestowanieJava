package lab4.Armstrong;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import lab3.Armstrong;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ArmstrongJUnitParamsTest {

    private Armstrong armstrong;

    @Before
    public void setUp(){
        armstrong = new Armstrong();
    }

    @Test
    @FileParameters("src/test/java/lab4/Armstrong/files/test.csv")
    public void testIfIsAnArmstrongNumber(String number, String expected) {
        assertEquals(Boolean.parseBoolean(expected), armstrong.IsArmstrongNumber(number));
    }

    @Test(expected = NumberFormatException.class)
    @FileParameters("src/test/java/lab4/Armstrong/files/exceptionalValues.csv")
    public void testIfThrowsException(String number) {
        armstrong.IsArmstrongNumber(number);
        Assert.fail();
    }

    @After
    public void tearDown(){
        armstrong = null;
    }

}
