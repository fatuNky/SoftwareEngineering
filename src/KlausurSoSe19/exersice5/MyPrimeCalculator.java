package KlausurSoSe19.exersice5;

import java.util.Scanner;



public class MyPrimeCalculator {

    /**
     * the amount of times this method was called
     */
    private static int tries = 0;


    public static void main(String[] args) throws TooManyCallsException {

        //Just for testing the method
        Scanner input = new Scanner(System.in);

        for (;;) {
            System.out.print("next:");
            System.out.println(isPrime(input.nextInt()));
        }
    }


    /**
     * This method can only be called 3 times by one user.
     * Throws an Exception the 4th time it is called.
     *
     * @param number to be checked if prime
     * @return if number is prime or not
     */
    public static boolean isPrime(int number) throws TooManyCallsException {
        tries++;
        if (tries == 4) {
            throw new TooManyCallsException("Exceeded number of tries!");
        }
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}
