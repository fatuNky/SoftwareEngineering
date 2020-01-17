package uebung5.uebung5_2;

public class UsernameGenerator {



    public static void main(String[] args) {

        String email = "fatih.nakay@htwg-konstanz.de";

        String regExUsername = "@";

        String[] username = email.split(regExUsername);

        System.out.println("suggested username:\n" + username[0]);




        //Alternative with for-loop

        for (int i = 0; email.charAt(i) != '@'; i++) {
            System.out.print(email.charAt(i));
        }

    }

}
