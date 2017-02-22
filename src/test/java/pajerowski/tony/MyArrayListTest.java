package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 2/20/17.
 */
public class MyArrayListTest {
    MyArrayList r;
    MyArrayList full;

    @Before
    public void setup() {
        r = new MyArrayList(10);
        full = new MyArrayList(5);
        full.add(1);
        full.add(2);
        full.add(3);
        full.add(4);
        full.add(5);
    }

    @Test
    public void myArrayListDefaultConstructorSizeTest() {
        Integer expected = 0;
        Integer actual = r.size();
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListDefaultConstructorCapacityTest() {
        Integer expected = 10;
        Integer actual = r.getCurrentCapacity();
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListAddTest() {
        Integer expected = 1;
        r.add(1);
        Integer actual = r.size();
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListGetTest() {
        String expected = "cheeseburger";
        r.add("cheeseburger");
        String actual = (String) r.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListGetOutOfBoundsTest() {
        Class expected = IndexOutOfBoundsException.class;
        try {
            r.get(1);
        } catch (IndexOutOfBoundsException e) {
            Class actual = e.getClass();
            assertEquals(expected, actual);
        }
    }

    @Test
    public void myArrayListSetTest() {
        String expected = "potatoe";
        r.add("rutabega");
        r.add("parsnip");
        r.add("onion");
        r.set(1, "potatoe");
        String actual = (String) r.get(1);
        System.out.println(r.get(0));
        System.out.println(r.get(1));
        System.out.println(r.get(2));
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListClearTest() {
        String expected = null;
        r.add("an entry");
        r.clear();
        String actual = (String) r.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListIsEmptyTrueTest() {
        Boolean expected = true;
        Boolean actual = r.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListIsEmptyFalseTest() {
        Boolean expected = false;
        r.add("value");
        Boolean actual = r.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListContainsTrueTest() {
        Boolean expected = true;
        r.add("r");
        r.add("o");
        Boolean actual = r.contains("o");
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListContainsFalseTest() {
        Boolean expected = false;
        Boolean actual = r.contains("nothere");
        assertEquals(expected, actual);
    }

    @Test
    public void myArrayListRemoveElementTest() {
        Integer expected = 4;
        full.remove(2);
        Integer actual = full.size();
        assertEquals(expected, actual);
    }
}