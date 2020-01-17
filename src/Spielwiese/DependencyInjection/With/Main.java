package Spielwiese.DependencyInjection.With;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create object but don't initialize it yet
        Search userDB;

        System.out.println("\n*Running example with dependency injection*\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Welche Datenbank soll durchsucht werden?\n1 für DB1\n2 für DB2\n3 für DB3");

        int userDecision = input.nextInt();

        System.out.println("Welcher Text soll gesucht werden?");
        String text = input.next();

        switch (userDecision) {
            case 1:
                userDB = new Search(new DB1());
                break;
            case 2:
                userDB = new Search(new DB2());
                break;
            case 3:
                userDB = new Search(new DB3());
                break;
            case 4:
                userDB = new Search(new DB4());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userDecision);
        }
        userDB.search(text);

        //TODO: add DB4 and delete DB2

    }
}
