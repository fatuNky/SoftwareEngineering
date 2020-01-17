package Spielwiese.DependencyInjection.With;

public class Search {

    private static DBBlueprint myDB;

    public Search(DBBlueprint myDB) {
        this.myDB = myDB;
    }

    public static void search(String text){
        String newText = changeTextToUpperCase(text);
        myDB.search(newText);
    }

    //Implement method only once
    public static String changeTextToUpperCase(String text){
        return text.toUpperCase();
    }

}
