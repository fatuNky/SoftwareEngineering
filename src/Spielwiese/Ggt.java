package Spielwiese;

import java.util.Scanner;

    class GgT {

        public static void main(String[] args) {

            Scanner insert = new Scanner(System.in);


            //Gr��ter gemeinsamer Teiler
            System.out.println("Geben Sie zwei Zahlen ein: ");
            System.out.print("Erste Zahl: ");
            int m = insert.nextInt();
            System.out.print("Zweite Zahl: ");
            int n = insert.nextInt();

            System.out.println("Der gr��te gemeinsame Teiler von '" + m + "' und '" + n + "' ist: " +ggT(m, n));

            insert.close();

        }
        static int ggT(int m, int n) {
            if (n == 0) {
                return m;
            } else {
                return ggT(n, m%n);
            }
        }
    }

