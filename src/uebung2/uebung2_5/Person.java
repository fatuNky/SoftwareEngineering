package uebung2.uebung2_5;

public class Person {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void canSeeFlightDetails(){
        System.out.println(this.name + " can see flight Details.");
    }
}
