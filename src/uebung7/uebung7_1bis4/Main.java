package uebung7.uebung7_1bis4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A4");
        Car car2 = new Car("Mercedes", "C");
        Car car3 = new Car("Porsche", "918 Spider");
        Car car4 = new Car("Ford", "Mustang");


        List list = new ArrayList<>();
        list.add(23);


        LList cars = new LList();
        cars.insert(car1);
        cars.insert(car2);
        cars.insert(car4);


        for (Node node : cars) {
            System.out.println(node.getContent());
        }
/*
        //Exercise 1
        System.out.println("\n-> exercise 1: check if list contains object \n");
        System.out.println(cars.contains(car1));
        System.out.println("\n---------");

        //Exercise 2
        System.out.println("-> exercise 2: insert car in any place in list and remove old object\n");
        cars.put(1, car3);

        for (Node node : cars) {
            System.out.println(node.getContent());
        }
        System.out.println("\n---------");

*/
        //Exercise 3
        System.out.println("-> exercise 3: insert car in any place in list and shift all following objects");
        cars.insert(0, car3);

        for (Node node : cars) {
            System.out.println(node.getContent());
        }
        System.out.println("\n---------");


        //Exercise 4
        System.out.println("-> exercise 4: remove car if in list and print true or false");
        System.out.println(cars.remove(car4));

        for (Node node : cars) {
            System.out.println(node.getContent());
        }

    }

}
