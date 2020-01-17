package Klausur.exercise3;

public class DbAccess {

    private Db db;

    DbAccess(Db database){
        this.db=database;
    }


    public void write(String text){
        text = text.toUpperCase();
        db.write(text);
    }

}
