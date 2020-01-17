package Spielwiese;

public class RegEx {

    public static void main(String[] args) {

        String email = "as@htwg-konstanz.de";


        String regExMail = ".{3,15}@.*\\.(de|org|ch)";

        if(email.matches(regExMail)) {
            System.out.println("E-Mail valid");
        }else {
            System.out.println("E-Mail not valid");
        }

    }
}
