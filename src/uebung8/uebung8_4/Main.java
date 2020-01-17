package uebung8.uebung8_4;

public class Main {

    public static void main(String[] args) {

//        AnimalHouse<Animal> house = new AnimalHouse<Cat>(); //Incompatible type

        //AnimalHouse<Dog> house = new AnimalHouse<Animal>(); //Incompatible type

        //AnimalHouse<?> house = new AnimalHouse<Cat>();
        //house.setAnimal(new Cat()); //cannot be applied

        AnimalHouse house = new AnimalHouse();
        house.setAnimal(new Dog());
    }
}
