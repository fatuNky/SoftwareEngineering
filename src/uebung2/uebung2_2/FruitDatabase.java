package uebung2.uebung2_2;

import java.util.ArrayList;
import java.util.List;

public class FruitDatabase implements UserFoodSearch {

    private List<String> fruits = new ArrayList<>();

    public void insert(String fruit){
        fruits.add(fruit);
    }


    @Override
    public void search(String text) {

        System.out.println("Fruit Database wird durchsucht! ");

        for (String string:fruits) {
            if (string.equals(text)){
                System.out.println("Found fruit in DB");
            }else{
                System.out.println("Could not find fruit");
            }

        }
    }
}
