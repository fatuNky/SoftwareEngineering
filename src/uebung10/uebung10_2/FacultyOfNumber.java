package uebung10.uebung10_2;

public class FacultyOfNumber {

    public static void main(String[] args)  {

        try {
            System.out.println(factorial(1));
        } catch (FacultyTooLargeException e) {
            System.out.println("Number too Large");
        }

        try {
            int x = factorial(20);
        } catch (FacultyTooLargeException e) {
            System.out.println("Number too large");
        }


    }

    public static int factorial(int x) throws FacultyTooLargeException {

        int val = 1;
        for(int i = 1; i <= x; i++) {
            val *= i;
        }

        if (val<0){
            throw new FacultyTooLargeException("Number too large");
        }else{
            System.out.println(x);
        }

        return val;
    }
}
