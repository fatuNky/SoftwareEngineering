package Spielwiese.DependencyInjection.With;

import java.util.List;

public class DB1 implements DBBlueprint {
    List<String> list = List.of("A", "b");

    @Override
    public void search(String text) {
        if (list.contains(text)){
            System.out.println("yep");
        }else{
            System.out.println("nope");
        }
    }
}
