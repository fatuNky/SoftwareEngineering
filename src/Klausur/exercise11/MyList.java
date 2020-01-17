package Klausur.exercise11;

import java.util.ArrayList;

public class MyList<T> extends ArrayList {


    public int getAverage(){
        int sum = 0;
        int avg;

        for (int i = 0; i <size(); i++) {
            sum += (int) get(i);
        }
        avg = sum/size();
        return avg;
    }
}
