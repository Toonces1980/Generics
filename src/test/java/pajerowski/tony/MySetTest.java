package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MySetTest {
    MySet s;
    MyArrayList r;

    @Before
    public void setup() {
        s = new MySet();
        r = new MyArrayList();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(3);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
    }

    @Test
    public void mySetAddTest() {
        Boolean expected = true;
        Boolean actual = s.add("1");
        assertEquals(expected,actual);
    }

    @Test
    public void mySetAddTestValueAdded() {
        Integer expected = 1;
        Integer actual = s.size();
        assertEquals(expected,actual);
    }

    public void mySetAddTestForValueAdded() {
        Integer expected = -1;
        s.add("1");
        Integer actual = null;
        assertEquals(expected,actual);
    }

    public void mySetAddTestForNoRepeatValues() {
        Integer expected = 1;
        s.add("1");
        s.add("1");
        Integer actual = s.size();
        assertEquals(expected,actual);
    }

    public void mySetAddAllTest() {
        Boolean expected = null;
        Boolean actual = null;
    }

    public void mySetClearTest() {
        Integer expected = 0;
        s.add(1);
        s.clear();
        Integer actual = s.size();
        assertEquals(expected,actual);
    }

    public void mySetContainsTest() {
        Boolean expected = null;
        Boolean actual = null;
        assertEquals(expected,actual);
    }

    public void mySetContainsAllTest() {
        Boolean expected = null;
        Boolean actual = null;
        assertEquals(expected,actual);
    }

    public void mySetEqualsTest() {
        Boolean expected = null;
        Boolean actual = null;
        assertEquals(expected,actual);
    }

    public void mySetHashCodeTest() {
    }

    public void mySetIsEmptyTest() {
        Boolean expected = null;
        Boolean actual = null;
        assertEquals(expected,actual);
    }

    public void mySetIteratorTest() {
    }

    public void mySetRemoveTrueTest() {
        Boolean expected = false;
        Boolean actual = s.remove("cheese");
        assertEquals(expected,actual);
    }

    public void mySetRemoveFalseTest() {
        Boolean expected = false;
        Boolean actual = s.remove("cheese");
        assertEquals(expected,actual);
    }

    public void mySetRemoveElementRemovedTest() {
        Boolean expected = false;
        Boolean actual = s.remove("cheese");
        assertEquals(expected,actual);
    }

    public void mySetRemoveAllTest() {
        Boolean expected = false;
        Boolean actual = s.remove("cheese");
        assertEquals(expected,actual);
    }

    public void mySetRetainAllTest() {

    }

    public void mySetSizeTest() {
        Integer expected = 2;

        Integer actual = s.size();
        assertEquals(expected,actual);
    }

    public void mySetToArrayDefaultTest() {

    }

    public void mySetToArrayCollectionTest() {

    }
}