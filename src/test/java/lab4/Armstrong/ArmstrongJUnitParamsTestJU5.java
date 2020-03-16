package lab4.Armstrong;

import lab3.Armstrong;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;


class ArmstrongJUnitParamsTestJU5 {

    private static Armstrong armstrong;

    @BeforeAll
    static void setUp(){
        armstrong = new Armstrong();
    }

    @ParameterizedTest(name = "{index} ==> returns {1} for input number {0}")
    @DisplayName("Check if number is an Armstrong number")
    @CsvFileSource(resources = "/ArmstrongParametrized/test.csv")
    void testIfIsAnArmstrongNumber(String number, String expected) {
        Assertions.assertEquals(Boolean.parseBoolean(expected), armstrong.IsArmstrongNumber(number));
    }

    @ParameterizedTest(name = "{index} ==> throws exception for input ''{0}''")
    @DisplayName("Throw exception when input string does not contain a number")
    @CsvFileSource(resources = "/ArmstrongParametrized/exceptionalValues.csv")
    void testIfThrowsException(String number) {
        Assertions.assertThrows(NumberFormatException.class, () -> armstrong.IsArmstrongNumber(number));
    }

    @AfterAll
    static void tearDown(){
        armstrong = null;
    }

}
