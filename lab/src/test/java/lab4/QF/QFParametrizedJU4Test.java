package lab4.QF;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import lab4.QuadraticFunction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QFParametrizedJU4Test {

    private QuadraticFunction test;
    private int inputA;
    private int inputB;
    private int inputC;

    public QFParametrizedJU4Test(int a, int b, int c){
        inputA = a;
        inputB = b;
        inputC = c;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] c = {
                {44,8,-30}, {20,24,-12}, {13,12,1}, {-100,25,25}, {23, -44, 5}, {43, 45, -34}, {2,1,0}
        };
        return  Arrays.asList(c);
    }

    @Before
    public void setUp(){
        test = new QuadraticFunction(inputA, inputB, inputC);
    }

    @Test
    public void testFunctionWithTwoZeroPlaces() {
        assertNotEquals(test.getX1(), test.getX2(), 0);
    }

    @After
    public void teardown(){
        test = null;
    }
}