package Probeklausur.exercise8;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(findNthOddElement(list, 2));
    }


    //exercise 8
    public static int findNthOddElement(List<Integer> list, int index) {

        if (index<0){
            return 0;
        }
        int counter = 0;
        int searchedNumber = 0;
        for (Integer integer:list) {
            if (integer%2==1){
                counter++;
            }
            if (counter==index){
                searchedNumber=integer;
                break;
            }
        }
        if (counter < index) {
            throw new IndexOutOfBoundsException("List too small!");
        }
        return searchedNumber;
    }

}
