package uebung10.uebung10_1;



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

        cars.remove(1);

        System.out.println(cars.size());

        System.out.println(cars.get(0));




//		Car[] cars = new Car[2];
//
//		cars[0] = car1;
//		cars[1] = car2;
//
//		for (Car car : cars) {
//			System.out.println(car);
//		}




    }

}

