package uebung3.uebung3_2;

public class Airplane {

    private int ID;
    private int amountOfSeats;
    private String engine;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Airplane addSameTypeOfPlane(int newID){

        Airplane airplane = new Airplane();
        airplane.setID(newID);
        airplane.setAmountOfSeats(this.amountOfSeats);
        airplane.setEngine(this.engine);
        return airplane;
    }


    public static void main(String[] args) {

        Airplane a1 = new Airplane();
        a1.setID(1000);
        a1.setAmountOfSeats(300);
        a1.setEngine("Diesel");

        Airplane a2 = a1.addSameTypeOfPlane(2000);


        System.out.println("Airplane 1 -> ID: " + a1.ID + " | Amount of Seats: " + a1. getAmountOfSeats() + " | Engine: " + a1.getEngine());
        System.out.println("Airplane 2 -> ID: " + a2.ID + " | Amount of Seats: " + a2. getAmountOfSeats() + " | Engine: " + a2.getEngine());

    }

}
