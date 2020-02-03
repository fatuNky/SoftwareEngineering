package Probeklausur.exercise3;

public class MySql implements Db{

    @Override
    public void write(String entry) {
        System.out.println("Entry written in MySQL Database: " + entry);
    }
}
