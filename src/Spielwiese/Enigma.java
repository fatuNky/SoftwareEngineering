package Spielwiese;

public class Enigma {


    private Walze [] walze = new Walze[3]; //Enigma hat 3 Walzen, deshalb [3]
    private String key = "";

    public Enigma (int walze1, int walze2, int walze3, String key) //Konstructor, der drei int-Werte (für die Walzennummern) und einen String-Parameter erhält (für den Schlüssel)
    {
        walze[0] = new Walze(walze1); // Konstruktor instantiiert abhängig von den Walzennummern die entsprechenden Walzen
        walze[1] = new Walze(walze2);
        walze[2] = new Walze(walze3);

        this.key = key;
    }

    //entschlüsseln

    public String encrypt(String s)
    {
        char startW0 = key.charAt(0);
        char startW1 = key.charAt(1);
        char startW2 = key.charAt(2);

        char Zielzeichen;
        char searchedLetter;
        int rotation = 0;
        char [] verschlüsselt = new char [s.length()];


        for (int i = 0; i < s.length(); i++)
        {
            Zielzeichen = s.charAt(i);

            if (i % 2 == 0)
            {
                rotation = walze[0].countClockwiseRotations(startW0, Zielzeichen);
            }
            else
            {
                rotation = walze[1].countCounterClockwiseRotations(startW1, Zielzeichen);
            }

            searchedLetter = walze[2].rotateClockwise(startW2, rotation);
            verschlüsselt[i] = searchedLetter;
        }

        String encrypted = String.valueOf(verschlüsselt);
        return encrypted;


    }


    // verschlüsseln, Aufgabe 39

    public String decrypt(String s)
    {
        char startW0 = key.charAt(0);
        char startW1 = key.charAt(1);
        char startW2 = key.charAt(2);

        char Zielzeichen;
        char searchedLetter;
        int rotation = 0;
        char [] verschlüsselt = new char [s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            Zielzeichen = s.charAt(i);

            rotation = walze[2].countCounterClockwiseRotations(startW2, Zielzeichen);

            if (i % 2 == 0)
            {
                searchedLetter = walze[0].rotateCounterClockwise(startW0, rotation);
            }
            else

            {
                searchedLetter = walze[1].rotateClockwise(startW1, rotation);
            }

            verschlüsselt[i] = searchedLetter;
            System.out.println("searched");
        }

        String decrypted = String.valueOf(verschlüsselt);
        return decrypted;


    }

}
