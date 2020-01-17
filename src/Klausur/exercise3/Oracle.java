package Klausur.exercise3;

public class Oracle implements Db {
    @Override
    public void write(String entry) {
        System.out.println("Entry written in Oracle Database: " + entry);
    }
}
