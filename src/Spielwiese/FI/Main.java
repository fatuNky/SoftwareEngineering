package Spielwiese.FI;

public class Main {
    public static void main(String[] args) {

        PerformOperation isOdd = (x) -> x % 2 == 1;

        PerformOperation isPrime = (x) -> {
            for (int i = 2; i <= x / 2 ; i++) {
                if(x % i == 0)
                    return false;
            }
            return true;
        };

        System.out.println(isPrime.check(87));
        System.out.println(isPrime.check(3));

    }
}
