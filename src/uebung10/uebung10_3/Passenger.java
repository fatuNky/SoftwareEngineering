package uebung10.uebung10_3;

public class Passenger implements Human{

    private String name;
    private int age;

    Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString (){
        return "Name: " + this.name + "; Age: " + this.age;
    }
}
