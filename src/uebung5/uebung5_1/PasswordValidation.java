package uebung5.uebung5_1;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "sdfshn7fh";

        String valid = "Password is valid";
        String invalid = "Password is not valid!";

        String regExPassword = "[A-Za-z].{3,14}";

        if (password.matches(regExPassword)){
            System.out.println(valid);
        }else {
            System.out.println(invalid);
        }
    }

}
