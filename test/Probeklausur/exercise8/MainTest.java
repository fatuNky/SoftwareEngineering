package Probeklausur.exercise8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    Main checkNumber = new Main();
    List<Integer> list = new ArrayList<>();

    @Test
    public void findNthOddElement(){

        list.add(0); list.add(1); list.add(2);
        list.add(3); list.add(4); list.add(5);
        list.add(6); list.add(7); list.add(8);
        list.add(9);

        assertEquals(3,checkNumber.findNthOddElement(list, 2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void findNthOddElement_Exception(){
        list.add(0); list.add(1); list.add(2);
        list.add(3); list.add(4); list.add(5);
        list.add(6); list.add(7); list.add(8);
        list.add(9);

        checkNumber.findNthOddElement(list,12);

    }

    @Test
    public void findNthOddElement_NegativeElement(){

        list.add(0); list.add(1); list.add(2);
        list.add(3); list.add(4); list.add(5);
        list.add(6); list.add(7); list.add(8);
        list.add(9);

        assertEquals(0,checkNumber.findNthOddElement(list, -2));
    }

}