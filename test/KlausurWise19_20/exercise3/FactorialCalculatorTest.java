package KlausurWise19_20.exercise3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCalculatorTest {
    FactorialCalculator mock = new FactorialCalculator();

    @Test(expected = ExtendTestVersionException.class)
    public void factorialExeptionTest() throws ExtendTestVersionException {
        mock.factorial(8);
    }

    public void factorialRegularTest() throws ExtendTestVersionException {
        Assert.assertEquals(mock.factorial(7), 5040);
    }

}