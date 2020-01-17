package Spielwiese.DependencyInjection.With;

import java.util.List;

public class DB2 implements DBBlueprint {
    List<String> list = List.of("c", "d");

    @Override
    public void search(String text) {
        if (list.contains(text)){
            System.out.println("yep");
        }else{
            System.out.println("nope");
        }
    }
}
