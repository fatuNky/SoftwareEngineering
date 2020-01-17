package uebung7.uebung7_5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A4");
        Car car2 = new Car("Mercedes", "C");
        Car car3 = new Car("Porsche", "918 Spider");
        Car car4 = new Car("Ford", "Mustang");

        LList cars = new LList ();
        cars.insert(car1);
        cars.insert(car3);
        cars.insert(car1);

        for (Object object : cars) {
            System.out.println(object);
        }





    }

}
