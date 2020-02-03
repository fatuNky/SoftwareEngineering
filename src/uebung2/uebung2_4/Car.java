package uebung2.uebung2_4;

public class Car {

    private static String manufacturer;
    private String colour;
    private int horsePower;
    private int doors;


    public Car(){

    }

    public Car(String manufacturer, String colour, int horsePower, int doors) {
        super();
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.horsePower = horsePower;
        this.doors = doors;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Car.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public static void main(String[] args) {

        Builder builder = new Builder();

        Car myCar = builder.setManufacturer("Audi")
                            .setColour("Black")
                            .setHorsePower(230)
                            .setDoors(4)
                            .build();

        Car myCar2 = builder.setManufacturer("Audi")
                .setColour("Black")
                .setHorsePower(230)
                .setDoors(4)
                .build();

        Car car = new Car();
        Car car1 = new Car();
        car.setColour("fsfs");
        car1.setColour("fs");
        car.setDoors(3);
        car1.setDoors(4);


        System.out.println(myCar.printCarDetails());
/*
*/
    }

    public String printCarDetails() {
        return "Hersteller: " + this.manufacturer +
                " \nFarbe: " + this.colour +
                " \nPS: " + this.horsePower +
                " \nAnzahl Türen: " + this.doors;
    }

    static class Builder{ //independent from class Car

        private String manufacturer;
        private String colour;
        private int horsePower;
        private int doors;

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
             return this;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Car build() {
            return new Car(manufacturer, colour, horsePower, doors);
        }
    }


}
