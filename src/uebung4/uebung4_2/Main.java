package uebung4.uebung4_2;

public class Main {


    public static void main(String[] args) {

        Car car = new Car();

        car.setName("a4");
        car.setEngine(EngineType.DIESEL);
        car.setConsumption(5);
        car.setConsumptionUnit(ConsumptionUnit.LITER);

        System.out.println("The model is " + car.getName() +
                            " and it consumes " + car.getConsumption() + " "+ car.getConsumptionUnit()+
                            " with a " + car.getEngine()+ " Engine");
    }

}

