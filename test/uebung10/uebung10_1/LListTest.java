package uebung10.uebung10_1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertSame;


public class LListTest {

    private LList list = new LList();
    private Car car1 = new Car("Audi", "A4");
    private Car car2 = new Car("Porsche", "911");
    private Car car3 = new Car("Jaguar", "XF");


    @Test
    public void testInsert() {
        list.insert(car1);
        list.insert(car2);
        assertEquals(2, list.size());
    }

    @Test
    public void testGet() {
        list.insert(car1);
        list.insert(car2);
        assertSame(car1, list.getHead().getContent());
    }

    @Test
    public void testRemove() {
        list.insert(car1);
        list.insert(car2);

        list.remove(car1);
        assertEquals(1, list.size());

    }

}