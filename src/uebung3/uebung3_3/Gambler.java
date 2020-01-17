package uebung3.uebung3_3;

public class Gambler {

    private String name;
    private int budget;

    public Gambler(String name){
        this.name = name;
        this.budget = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

}
