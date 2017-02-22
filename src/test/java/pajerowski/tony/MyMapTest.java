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
    public void myMapClearTest() {
        Integer expected = 0;
        m.put("key", 3);
        m.clear();
        Integer actual = m.size();
        assertEquals(expected, actual);
    }

    @Test
    public void myMapContainsKeyTest() {
        Boolean expected = true;
        m.put(1, 2);
        Boolean actual = m.containsKey(1);
        assertEquals(expected, actual);
    }

    @Test
    public void myMapContatinsValue() {
        Boolean expected = true;
        m.put(1, 2);
        Boolean actual = m.containsValue(2);
        assertEquals(expected, actual);
    }

    @Test
    public void myMapEntrySetTest() {

    }

    @Test
    public void myMapEqualsTest() {
        Boolean expected = true;
        m.put(1, 2);
        m.put(2, 2);
        Boolean actual = (m.get(0)).equals(m.get(1));
        assertEquals(expected, actual);
    }

    @Test
    public void myMapIsEmptyFalseTest() {
        Boolean expected = false;
        m.put(1, 2);
        Boolean actual = m.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void myMapIsEmptyTrueTest() {
        Boolean expected = true;
        Boolean actual = m.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void myMapKeySet() {

    }

    @Test
    public void myMapPutTest() {
        Integer expected = 1;
        Integer actual = stringInt.size();
        assertEquals(expected, actual);
    }

    @Test  //takes key as argument and removes Key and Value for the key
    public void myMapRemoveTest() {

    }
}