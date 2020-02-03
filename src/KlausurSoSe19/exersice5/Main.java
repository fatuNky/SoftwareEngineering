package KlausurSoSe19.exersice5;

import static KlausurSoSe19.exersice5.MyPrimeCalculator.isPrime;

public class Main {
    public static void main(String[] args) throws TooManyCallsException {

        MyPrimeCalculator calc = new MyPrimeCalculator();
        System.out.println(isPrime(3));
        System.out.println(isPrime(33));
        System.out.println(isPrime(365));
        System.out.println(isPrime(213));

    }

}

