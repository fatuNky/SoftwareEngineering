package KlausurWise19_20.exercise3;

public class FactorialCalculator {


    /**
     *
     * @param n ....
     * @return ....
     * @throws ExtendTestVersionException ....
     */
    public static int factorial(int n) throws ExtendTestVersionException {
        if (n <= 7){
            return n <= 1 ? 1 : n * factorial(n - 1);
        }else{
            throw new ExtendTestVersionException("This test version only calculates numbers up to 7!");
        }
    }

    public static void main(String[] args) throws ExtendTestVersionException {

        System.out.println(factorial(-7));


    }

}
