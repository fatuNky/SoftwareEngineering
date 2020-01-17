package Spielwiese.DependencyInjection.Without;

import java.util.List;

public class DB2 implements DBBlueprint {
    List<String> list = List.of("c", "d");

    @Override
    public void search(String text) {
        String newText = changeTextToUpperCase(text);
        if (list.contains(newText)){
            System.out.println("yep");
        }else{
            System.out.println("nope");
        }
    }

    //Implement method in every DB
    public String changeTextToUpperCase(String text){
        return text.toUpperCase();
    }
}
