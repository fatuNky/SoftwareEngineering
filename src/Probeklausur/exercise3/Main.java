package Probeklausur.exercise3;

public class Main {

    public static void main(String[] args) {

        DbAccess dbAccess = new DbAccess(new MySql());
        dbAccess.write("Test");

    }
}
