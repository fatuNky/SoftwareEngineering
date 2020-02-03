package KlausurSoSe19.exersice5;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPrimeCalculatorTest {

    @Test
    public void isPrimeNegavtiveTest() throws TooManyCallsException {
        assertFalse(MyPrimeCalculator.isPrime(-3));
    }

    @Test(expected = TooManyCallsException.class)
    public void isPrimeExceptionTest() throws TooManyCallsException {
        MyPrimeCalculator.isPrime(2);
        MyPrimeCalculator.isPrime(23);
        MyPrimeCalculator.isPrime(343);
        MyPrimeCalculator.isPrime(52);
    }

    @Test
    public void isPrimeFunctionalityTest() throws TooManyCallsException {
        assertTrue(MyPrimeCalculator.isPrime(3));
    }


}