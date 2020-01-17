package Spielwiese;

public class Walze {
    // Instanzvariablen werden festgelegt. "final" da es sich um unveränderbare Konstanten handelt.

    private static final String WN50 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String WN51 = "ADCBEHFGILJKMPNOQTRSUXVWZY";
    private static final String WN60 = "ACEDFHGIKJLNMOQPRTSUWVXZYB";
    private static final String WN61 = "AZXVTRPNDJHFLBYWUSQOMKIGEC";
    private static final String WN70 = "AZYXWVUTSRQPONMLKJIHGFEDCB";
    private static final String WN71 = "AEBCDFJGHIKOLMNPTQRSUYVWXZ";

    private int Walzennummer;

    public Walze (int Nummer)
    {
        this.Walzennummer = Nummer; // die Nummer wird der Instanzvariablen "Walzennummer" übergeben
    }


    // 38.3 mit den Uhrzeigersinn:


    public int countClockwiseRotations(char start, char ziel) // "int", da es sich beim return-Wert ( = counter) um einen int-Wert handelt.
    {
        int counter = 0; //zählt, wieviele Positionen im Uhrzeigersinn das Zielzeichen vom Startzeichen entfernt ist
        String Walze = "";

        switch (Walzennummer) //richtige Walze wird gewählt
        {
            case 50: Walze = WN50;
                break;
            case 51: Walze = WN51;
                break;
            case 60: Walze = WN60;
                break;
            case 61: Walze = WN61;
                break;
            case 70: Walze = WN70;
                break;
            case 71: Walze = WN71;
                break;
            default: System.out.println("Walzennummer nicht gefunden!");
        }
        for (int i = 0; i < Walze.length(); i++) /* nachdem die Walze ausgewählt wurde, wird jede Position überprüft,
	    											ob sie mit dem eingegebenen Startwert übereinstimmt. */
        {
            if (Walze.charAt(i) == start) /*falls es sich an der Stelle i um den eingegeben Startwert handelt ...
            								... such mir an der Stelle j den Zielwert */
            {
                for (int j = i; j < Walze.length() * 2; j++) /* *2, da es sein kann dass ich wieder von vorne angangen muss
                											zu zählen, da nach dem letzten Zeichen wieder beim ersten weiter
                											gezählt wird! */
                {
                    if (j == Walze.length()) /* falls es sich bei j um das letzten Zeichen der Walze handelt, wird j wieder auf
                								0 gesetzt und man fängt wieder beim ersten Zeichen an zu zählen */
                    {
                        j = 0;
                    }
                    if (Walze.charAt(j) == ziel) // handelt es sich an der Stelle j um den Zielwert --> break
                    {
                        break;
                    }

                    counter++; /* jedes Mal, wenn es sich bei j noch nicht um den Zielwert handelt, wird der counter eins
                    			nach oben gezählt. Wir der Zielwert erreicht, dann break (siehe oben) */
                }
            }
        }
        return counter; // Der Wert des counters wird am Ende ausgegeben
    }



    // 38.4 gegen den Uhrzeigersinn:


    public int countCounterClockwiseRotations(char start, char ziel) // "int", da es sich beim return-Wert ( = counter) um einen int-Wert handelt.
    {
        int counter = 0; //zählt, wieviele Positionen im Uhrzeigersinn das Zielzeichen vom Startzeichen entfernt ist
        String Walze = "";

        switch (Walzennummer) //richtige Walze wird gewählt
        {
            case 50: Walze = WN50;
                break;
            case 51: Walze = WN51;
                break;
            case 60: Walze = WN60;
                break;
            case 61: Walze = WN61;
                break;
            case 70: Walze = WN70;
                break;
            case 71: Walze = WN71;
                break;
            default: System.out.println("Walzennummer nicht gefunden!");
        }

        for (int i = 0; i < Walze.length(); i++) /* nachdem die Walze ausgewählt wurde, wird jede Position überprüft,
    	    											ob sie mit dem eingegebenen Startwert übereinstimmt. */
        {
            if (Walze.charAt(i) == start) /*falls es sich an der Stelle i um den eingegeben Startwert handelt ...
                								... such mir an der Stelle j den Zielwert */
            {
                for (int j = i; j < Walze.length() * 2; j--) /* *2, da es sein kann dass ich die Zeichenketten nochmal
        	   												durchlaufen muss, da beim Erreichen des ersten Zeichens wieder
        	   												beim letzten weiter gezählt wird! */
                {

                    if (Walze.charAt(j) == ziel) // handelt es sich an der Stelle j um den Zielwert --> break
                    {
                        return counter;
                    }

                    if (j == 0) /* falls es sich bei j um das erste Zeichen der Walze handelt, wird j wieder auf
                    			Walzenlänge ( = Position 25) gesetzt und man fängt wieder beim letzten Zeichen an zu zählen */
                    {
                        j = Walze.length()-1;
                    }



                    counter++; /* jedes Mal, wenn es sich bei j noch nicht um den Zielwert handelt, wird der counter eins
                        			nach oben gezählt. Wir der Zielwert erreicht, dann break (siehe oben) */
                }
            }
        }

        return counter; // Der Wert des counters wird am Ende ausgegeben
    }



    // 38.5 Buchstabe an der Stelle (start + counter) soll ausgegeben werden:

    public char rotateClockwise(char start, int counter)
    {
        char ziel = 0;
        int overflow;
        String Walze = "";

        switch (Walzennummer) //richtige Walze wird gewählt
        {
            case 50: Walze = WN50;
                break;
            case 51: Walze = WN51;
                break;
            case 60: Walze = WN60;
                break;
            case 61: Walze = WN61;
                break;
            case 70: Walze = WN70;
                break;
            case 71: Walze = WN71;
                break;
            default: System.out.println("Walzennummer nicht gefunden!");
        }

        for (int i = 0; i < Walze.length(); i++)
        {
            if (Walze.charAt(i) == start)
            {
                if ((i + counter) <= Walze.length())
                {
                    ziel = (Walze.charAt(i + counter));
                }
                else
                {
                    overflow = (i + counter) % Walze.length();
                    ziel = (Walze.charAt(overflow));
                }
            }
        }

        return ziel;
    }

    // 38.6 Buchstabe an der Stelle (start - counter) soll ausgegeben werden (gegen den Uhrzeigersinn):

    public char rotateCounterClockwise(char start, int counter)
    {
        char ziel = 0;
        int overflow;
        String Walze = "";

        switch (Walzennummer) //richtige Walze wird gewählt
        {
            case 50: Walze = WN50;
                break;
            case 51: Walze = WN51;
                break;
            case 60: Walze = WN60;
                break;
            case 61: Walze = WN61;
                break;
            case 70: Walze = WN70;
                break;
            case 71: Walze = WN71;
                break;
            default: System.out.println("Walzennummer nicht gefunden!");
        }

        for (int i = Walze.length(); i <= 0; i--)
        {
            if (Walze.charAt(i) == start)
            {
                if ((i - counter) <= Walze.length())
                {
                    ziel = (Walze.charAt(i - counter));
                }
                else
                {
                    overflow = Math.abs(i - counter) % Walze.length();
                    ziel = (Walze.charAt(Walze.length() - overflow));
                    //ziel = Walze.charAt(Walze.length() - (counter - i));
                }
            }
        }

        return ziel;
    }

}
