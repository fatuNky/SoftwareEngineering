package Probeklausur.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Secretary s1 = new Secretary("S1", 34);
        Secretary s2 = new Secretary("S2", 44);
        Secretary s3 = new Secretary("S3", 54);
        Secretary s4 = new Secretary("S4", 64);
        Secretary s5 = new Secretary("S5", 74);

        Professor p1 = new Professor("P1", 45);
        Professor p2 = new Professor("P1", 46);
        Professor p3 = new Professor("P1", 75);
        Professor p4 = new Professor("P1", 95);
        Professor p5 = new Professor("P1", 55);

        Student st1 = new Student("Student1", 15);
        Student st2 = new Student("Student2", 19);
        Student st3 = new Student("Student3", 13);
        Student st4 = new Student("Student4", 112);
        Student st5 = new Student("Student5", 11);
        Student st6 = new Student("Student6", 21);

        List<Human> humans = new ArrayList<>();

        humans.add(s1);
        humans.add(s2);
        humans.add(s3);
        humans.add(s4);
        humans.add(s5);

        humans.add(p1);
        humans.add(p2);
        humans.add(p3);
        humans.add(p4);
        humans.add(p5);

        humans.add(st1);
        humans.add(st2);
        humans.add(st3);
        humans.add(st4);
        humans.add(st5);
        humans.add(st6);

        int sum =0;
        for (Human human:humans){
            System.out.println(human.getAge());
            sum += human.getAge();

        }
        System.out.println(sum);

        for (int i = 0; i < humans.size(); i++) {
            sum+=humans.get(i).getAge();
        }
    }
}
