package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MyMapTest {
    MyMap m;
    MyMap<String, Integer> stringInt;

    @Before
    public void setup() {
        m = new MyMap();
        stringInt = new MyMap<String, Integer>();
        stringInt.put("keyFor5", 5);
    }

    @Test
    public void myMapGetValueTest() {
        Integer expected = 5;
        Integer actual = stringInt.get("keyFor5");
        assertEquals(expected,actual);
    }

    @Test
    public void myMapClearTest() {
        Integer expected = 0;
        m.put("key", 3);
        m.clear();
        Integer actual = m.size();
        assertEquals(expected, actual);
    }

    @Test
    public void myMapSizeTest() {
        Integer expected = 1;
        Integer actual = stringInt.size();
        assertEquals(expected,actual);
    }

    @Test
    public void myMapRemoveTest() {
        Integer expected = 0;
        stringInt.remove("keyFor5");
        Integer actual = stringInt.size();
        assertEquals(expected,actual);
    }

    @Test
    public void myMapKeySetTest() {
        stringInt.put("anotherkey", 55);
            System.out.println(stringInt.keySet());
    }

    @Test
    public void myMapIsEmptyTrueTest() {
        Boolean expected = true;
        stringInt.clear();
        Boolean actual = stringInt.isEmpty();
        assertEquals(expected,actual);
    }

    @Test
    public void myMapIsEmptyFalseTest() {
        Boolean expected = false;
        Boolean actual = stringInt.isEmpty();
        assertEquals(expected,actual);
    }
}