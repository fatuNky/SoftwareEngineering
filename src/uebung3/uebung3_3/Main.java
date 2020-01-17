package uebung3.uebung3_3;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Gambler g1 = new Gambler("Lucky");
        GamingMashine mashine = new GamingMashine(g1);

        for (int i = 0; i < 10; i++) {
            boolean win = mashine.play(g1);
            if(win){
                System.out.println("gewonnen");
            }else{
                System.out.println("verloren");
            }
        }
        System.out.println(" -> " + g1.getName() + " has " + g1.getBudget());

    }
}
