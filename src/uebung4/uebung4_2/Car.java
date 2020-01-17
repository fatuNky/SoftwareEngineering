package uebung4.uebung4_2;


public class Car {

    private String name;
    private EngineType engine;
    private int consumption;
    private ConsumptionUnit consumptionUnit;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public EngineType getEngine() {
        return engine;
    }
    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void setConsumptionUnit(ConsumptionUnit consumption) {
        this.consumptionUnit = consumption;
    }

    public ConsumptionUnit getConsumptionUnit() {
        return consumptionUnit;
    }
}

