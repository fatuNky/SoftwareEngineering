package Probeklausur.exercise4;

public class Student implements Human {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }
}
