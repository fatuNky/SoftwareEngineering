package uebung10.uebung10_1;

public class Car {

    private String manufucterer;
    private String model;

    public Car(String manufucterer, String model) {
        super();
        this.manufucterer = manufucterer;
        this.model = model;
    }
    public String getManufucterer() {
        return manufucterer;
    }
    public void setManufucterer(String manufucterer) {
        this.manufucterer = manufucterer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car [manufucterer=" + manufucterer + ", model=" + model + "]";
    }
}
