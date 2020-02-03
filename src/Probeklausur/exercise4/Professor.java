package Probeklausur.exercise4;

public class Professor implements Human {
    private String name;
    private int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int getAge() {
        return this.age;
    }
}
