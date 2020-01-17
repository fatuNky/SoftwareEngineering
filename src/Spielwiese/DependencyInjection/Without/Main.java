package Spielwiese.DependencyInjection.Without;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n*Running example without dependency injection*\n");

        //Create all DB objects
        DB1 db1 = new DB1();
   //     DB2 db2 = new DB2();
        DB3 db3 = new DB3();
        DB4 db4 = new DB4();

        Scanner input = new Scanner(System.in);

        System.out.println("Welche Datenbank soll durchsucht werden?\n1 für DB1\n2 für DB2\n3 für DB3\n4 für DB4");

        int userDesicion = input.nextInt();

        System.out.println("Welcher Text soll gesucht werden?");
        String text = input.next();


        //call search function through specific object method
        switch (userDesicion){
            case 1:
                db1.search(text);
                break;
            /*case 2:
                db2.search(text);
                break;
             */
            case 3:
                db3.search(text);
                break;
            case 4:
                db4.search(text);
                break;
        }

        //TODO: add DB4 and delete DB2

    }
}
