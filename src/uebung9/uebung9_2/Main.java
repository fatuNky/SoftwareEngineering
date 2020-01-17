package uebung9.uebung9_2;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A4");
        Car car2 = new Car("Mercedes", "C");

        LList cars = new LList();
        cars.insert(car1);
        cars.insert(car2);

        System.out.println(cars.size());

        for (Node node : cars) {
            System.out.println(node.getContent());
        }


        System.out.println(cars.size());



        try {
            System.out.println(cars.get(20));
        }catch (ListToSmallException e){
            e.printStackTrace();
        }



    }

}

