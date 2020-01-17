package uebung10.uebung10_2;

import org.junit.Test;
import uebung10.uebung10_3.Main;

import static org.junit.Assert.*;

public class FacultyOfNumberTest {
    FacultyOfNumber faculty = new FacultyOfNumber();

    @Test
    public void testFactorial() {

        int output = 0;
        try {
            output = faculty.factorial(10);
        } catch (FacultyTooLargeException e) {
            e.printStackTrace();
        }

        assertEquals(3628800, output);


    }

    @Test(expected = FacultyTooLargeException.class)
    public void testFactorial_NumberTooLarge() throws FacultyTooLargeException{

        faculty.factorial(20);

    }
}