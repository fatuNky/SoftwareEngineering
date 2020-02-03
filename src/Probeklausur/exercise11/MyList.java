package Probeklausur.exercise11;

import java.util.ArrayList;

public class MyList<T extends Integer> extends ArrayList<T> {

    public int getAverage(){
        int sum = 0;
        int avg;

        for (int value:this) {
            sum += value;
        }

        avg = sum/size();
        return avg;
    }
}
