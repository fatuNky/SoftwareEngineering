package uebung2.uebung2_3;

public class Building {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Room{
        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        private String number;
    }


    public static void main(String[] args) {

        Building b1 = new Building();
        b1.setName("Gebäude O");

        Building.Room r1 = b1.new Room(); //create a room using an existing building
        r1.setNumber("109");


        System.out.println(b1.getName()+r1.getNumber());
    }
}
