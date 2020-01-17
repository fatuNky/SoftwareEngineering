package uebung7.uebung7_6bis9;

public class Passenger{

    private String name;
    private Integer age;

    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Passenger [name = " + name + ", age= " + age + "]";
    }


}
