package Spielwiese.DependencyInjection.With;

import java.util.List;

public class DB3 implements DBBlueprint {
    List<String> list = List.of("e", "f");

    @Override
    public void search(String text) {
        if (list.contains(text)){
            System.out.println("yep");
        }else{
            System.out.println("nope");
        }
    }
}
