package Probeklausur.exercise11;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> salaryList = new MyList<>();

        salaryList.add(23);
        salaryList.add(64);
        salaryList.add(634);
        salaryList.add(123);

        System.out.println(salaryList.getAverage());

    }
}
