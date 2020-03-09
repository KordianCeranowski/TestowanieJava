package lab3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumeral romanNumeral;

    @Test
    public void test1ToRomanNumberI() {
        romanNumeral = new RomanNumeral(1);
        Assert.assertEquals("I", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test2ToRomanNumberII() {
        romanNumeral = new RomanNumeral(2);
        Assert.assertEquals("II", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test3ToRomanNumberIII() {
        romanNumeral = new RomanNumeral(3);
        Assert.assertEquals("III", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test4ToRomanNumberIV() {
        romanNumeral = new RomanNumeral(4);
        Assert.assertEquals("IV", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test5ToRomanNumberV() {
        romanNumeral = new RomanNumeral(5);
        Assert.assertEquals("V", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test6ToRomanNumberVI() {
        romanNumeral = new RomanNumeral(6);
        Assert.assertEquals("VI", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test9ToRomanNumberIX() {
        romanNumeral = new RomanNumeral(9);
        Assert.assertEquals("IX", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test27ToRomanNumberXXVII() {
        romanNumeral = new RomanNumeral(27);
        Assert.assertEquals("XXVII", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test48ToRomanNumberXLVIII() {
        romanNumeral = new RomanNumeral(48);
        Assert.assertEquals("XLVIII", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test49ToRomanNumberXLIX() {
        romanNumeral = new RomanNumeral(49);
        Assert.assertEquals("XLIX", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test59ToRomanNumberLIX() {
        romanNumeral = new RomanNumeral(59);
        Assert.assertEquals("LIX", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test93ToRomanNumberXCIII() {
        romanNumeral = new RomanNumeral(93);
        Assert.assertEquals("XCIII", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test141ToRomanNumberCXLI() {
        romanNumeral = new RomanNumeral(141);
        Assert.assertEquals("CXLI", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test163ToRomanNumberCLXIII() {
        romanNumeral = new RomanNumeral(163);
        Assert.assertEquals("CLXIII", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test402ToRomanNumberCDII() {
        romanNumeral = new RomanNumeral(402);
        Assert.assertEquals("CDII", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test575ToRomanNumberDLXXV() {
        romanNumeral = new RomanNumeral(575);
        Assert.assertEquals("DLXXV", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test911ToRomanNumberCMXI() {
        romanNumeral = new RomanNumeral(911);
        Assert.assertEquals("CMXI", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test1024ToRomanNumberMXXIV() {
        romanNumeral = new RomanNumeral(1024);
        Assert.assertEquals("MXXIV", romanNumeral.getRomanNumeral());
    }

    @Test
    public void test3000ToRomanNumberMMM() {
        romanNumeral = new RomanNumeral(3000);
        Assert.assertEquals("MMM", romanNumeral.getRomanNumeral());
    }

}