package uebung3.uebung3_3;

import java.util.Random;

public class GamingMashine {

    private Gambler gambler;


    public GamingMashine(Gambler gambler){
        this.gambler = gambler;
    }


    public static boolean play(Gambler gambler){

        Random random = new Random();
        boolean win = random.nextBoolean();

        if (win){
            wonGame(gambler);
        }else{
            lostGame(gambler);
        }

        return win;
    }

    public static void wonGame(Gambler gambler){
        int newBudget = gambler.getBudget() + 10;
        gambler.setBudget(newBudget);
    }

    public static void lostGame(Gambler gambler){
        int newBudget = gambler.getBudget() - 10;
        gambler.setBudget(newBudget);
    }




}
