package typeCasting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.setAge(34);
        Animal a2 = new Animal();

        DesertAnimals dAnimal = new DesertAnimals();
        dAnimal.setSound("bla bla");


        Lion lion = new Lion();

        lion.setKing("I am the King");

        animal = lion;

        Animal an = new Lion();

        lion.getName();

        print(lion);


//        System.out.println(animal.getName());

//        System.out.println(lion.getName());
    }

    public static void print(Object object){
        if(object instanceof Lion){
            System.out.println("Lion!!!");
        }else if(object instanceof DesertAnimals){
            System.out.println("Dessertttttt");
        }else if(object instanceof Animal){
            System.out.println("dsfsenmgoesngois");
        }


    }



}
