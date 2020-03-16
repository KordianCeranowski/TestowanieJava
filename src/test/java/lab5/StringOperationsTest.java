package lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringOperationsTest {
    private StringOperations stringOperations;

    @BeforeEach
    void setup() {
        stringOperations = new StringOperations();
    }

    @DisplayName("Concat Test")
    @ParameterizedTest(name = "Checking if {0} + {1} is {2}")
    @CsvSource({
            "Test1, Test2, Test1Test2",
            "12, 23, 1223",
            "qwer!, adsf, qwer!adsf",
            "!2e, e@1, !2ee@1",
            ", b, b",
            "a, , a",
            " , , ''",
            "'', b, b",
            "a, '', a",
    })
    void concat(String stringOne, String stringTwo, String expected) {
        assertEquals(expected, stringOperations.concat(stringOne, stringTwo));
    }

    @DisplayName("Reverse Test")
    @ParameterizedTest(name = "Trying to reverse {0}")
    @CsvSource({
            "test, tset",
            "!!??AA, AA??!!",
            "Qq1!, !1qQ",
            "21sdreverse, esreverds12",
            "agaer23sdf!!3, 3!!fds32reaga",
            "234198, 891432",
            "dar341, 143rad"
    })
    void reverse(String a, String expected) {
        assertEquals(expected, stringOperations.reverse(a));
    }


    @DisplayName("Palindrome Test")
    @ParameterizedTest(name = "Checking if {0} is a {1} palindrome")
    @CsvSource({
            "aba, true",
            "acbca, true",
            "hohohohoh, true",
            "hohhoohoh, false",
            "!hohoohoh!, true",
            "!1hohoohoh1!, true",
            "!1hohoohoh2!, false",
    })
    void palindrome(String a, Boolean expected) {
        assertEquals(expected, stringOperations.isPalindrome(a));
    }
}