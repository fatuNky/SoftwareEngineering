package uebung8.uebung8_0;

public class Main {

    public static void main(String[] args) {

        LList<Integer> list = new LList<>();

        list.insert(2);
        //list.insert("dsfdf"); compile error!

        Car car = new Car("Audi", "A8");

        LList<Car> cars = new LList<>();
        cars.insert(car);
        //cars.insert(4); compile error!



    }
}
