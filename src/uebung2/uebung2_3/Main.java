package uebung2.uebung2_3;

import tutorium.innerClasses.Building;

public class Main {

    public static void main(String[] args) {
        Building building = new Building("Gebäude O");

        Building.Room room = building.new Room("108");


        //this will create an error since Room is not a static class -> you need an object of Building to
        //create a room!
        //Building.Room room2 = new Building.Room("34")

        System.out.println(building.getName() + room.getRoomNumber());


    }
}
