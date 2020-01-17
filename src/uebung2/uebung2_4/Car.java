package uebung2.uebung2_4;

public class Car {

    private static String manufacturer;
    private String colour;
    private int horsePower;
    private int doors;


    public Car(String manufacturer, String colour, int horsePower, int doors) {
        super();
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.horsePower = horsePower;
        this.doors = doors;
    }

    public static void main(String[] args) {

        Builder builder = new Builder();

        Car myCar = builder.setManufacturer("Audi")
                            .setColour("Black")
                            .setHorsePower(230)
                            .setDoors(4)
                            .build();

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

    static class Builder { //independent from class Car

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
            return new Car(this.manufacturer, this.colour, this.horsePower, this.doors);
        }
    }


}
