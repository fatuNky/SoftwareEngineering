package uebung2.uebung2_3;

public class Building {

    private String name;

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    class Room {
        private String number;

        public Room(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

    }


    public static void main(String[] args) {

        Building b1 = new Building("Gebäude O");

        Building.Room r1 = b1.new Room("108"); //create a room using an existing building


        System.out.println(b1.getName() + r1.getNumber());
    }
}
