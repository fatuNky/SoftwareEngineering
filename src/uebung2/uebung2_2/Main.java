package uebung2.uebung2_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        Search searchDB;

        int desicion;



        while(true){
            System.out.println("Welche Datenbank möchten Sie durchsuchen? " +
                    "\n1 für Vegetable Database " +
                    "\n2 für Fruit Database");

            desicion=input.nextInt();

            if(desicion==1){
                searchDB = new Search(new VegetableDatabase());
                break;
            }else if(desicion==2) {
                searchDB = new Search(new FruitDatabase());
                break;
            }
            System.out.println("Ungültige Eingabe");
        }

        System.out.println("Nach welchem Text möchten Sie suchen?");

        String text = input.next();

        searchDB.search(text);



    }


}
