package Probeklausur.exercise4;

public class Secretary implements Human{

    private String name;
    private int age;

    public Secretary(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int getAge() {
        return this.age;
    }
}
