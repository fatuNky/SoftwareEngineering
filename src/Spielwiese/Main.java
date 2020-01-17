package Spielwiese;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //entschlüsseln
        System.out.println("Wählen Sie drei der nachfolgenden Walzennummer: 50, 51, 60, 61, 70, 71");
        Scanner s1 = new Scanner (System.in);
        int Walzennummer1 = s1.nextInt();
        int Walzennummer2 = s1.nextInt();
        int Walzennummer3 = s1.nextInt();

        System.out.println("Geben Sie nachfolgend den Schlüssel ein: ");
        Scanner s2 = new Scanner (System.in);
        String key1 = s2.next();

        Enigma neu1 = new Enigma(Walzennummer1, Walzennummer2, Walzennummer3, key1);

        System.out.println("Geben Sie nachfolgend den zu verschlüsselnden Plaintext ein. Verwenden Sie hierfür nur Großbuchstaben: ");
        Scanner s3 = new Scanner (System.in);
        String plaintext = s3.next();

        System.out.println("Der verschlüsselte Text lautet: " + neu1.encrypt(plaintext));

        // verschlüsseln Aufgabe 39

        System.out.println("Wählen Sie drei der nachfolgenden Walzennummer: 50, 51, 60, 61, 70, 71");
        Scanner s4 = new Scanner (System.in);
        int WN1 = s4.nextInt();
        int WN2 = s4.nextInt();
        int WN3 = s4.nextInt();

        System.out.println("Geben Sie nachfolgend den Schlüssel ein: ");
        Scanner s5 = new Scanner (System.in);
        String key2 = s5.next();

        Enigma neu2 = new Enigma(WN1, WN2, WN3, key2);

        System.out.println("Geben Sie nachfolgend den zu verschlüsselnden Plaintext ein. Verwenden Sie hierfür nur Großbuchstaben: ");
        Scanner s6 = new Scanner (System.in);
        String ciphertext = s6.next();

        System.out.println("Der verschlüsselte Text lautet: " + neu2.decrypt(ciphertext));



    }
}
