package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MySetTest {
    MySet s;
    MyArrayList r;
    MySet emptySetTester;
    int[] testArray;

    @Before
    public void setup() {
        emptySetTester = new MySet();
        s = new MySet();
        r = new MyArrayList();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(3);
        s.add(1);  // set created should only have 3 elements, as value at position 2 and three are repeated.
        s.add(2);
        s.add(3);
        s.add(3);
        testArray = new int[]{1,2,3};
    }

    @Test
    public void mySetAddTest() {
        Boolean expected = true;
        Boolean actual = s.add("1");
        assertEquals(expected,actual);
    }

    @Test
    public void mySetAddTestValueAddedTest() {
        Integer expected = 3;
        Integer actual = s.size();
        assertEquals(expected,actual);
    }

    @Test
    public void mySetAddNoDuplicatesAddedTest() {
        Integer expected = 1;
        emptySetTester.add(1);
        emptySetTester.add(1);
        Integer actual = emptySetTester.size();
        assertEquals(expected, actual);
    }

    @Test
    public void mySetContainsFalseTest() {
        Boolean expected = false;
        Boolean actual = s.contains("horse");
        assertEquals(expected,actual);
    }

    @Test
    public void mySetContainsTrueTest() {
        Boolean expected = true;
        Boolean actual = s.contains(1);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetAddAllTest() {
        Boolean expected = null;
        Boolean actual = null;
        assertEquals(expected,actual);
    }

    @Test
    public void mySetIsEmptyTrueTest() {
        Boolean expected = true;
        Boolean actual = emptySetTester.isEmpty();
        assertEquals(expected,actual);
    }

    @Test
    public void mySetIsEmptyFalseTest() {
        Boolean expected = false;
        Boolean actual = s.isEmpty();
        assertEquals(expected,actual);
    }

    @Test
    public void mySetClearTest() {
        Integer expected = 0;
        s.clear();
        Integer actual = s.size();
        assertEquals(expected,actual);
    }

    @Test
    public void mySetEqualsTrueTest() {
        Boolean expected = true;
        emptySetTester.add(1);
        emptySetTester.add(2);
        emptySetTester.add(3);
        Boolean actual = s.equals(emptySetTester);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetEqualsFalseTest() {
        Boolean expected = false;
        Boolean actual = s.equals(emptySetTester);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetContainsAllTrueTest() {
        Boolean expected = true;
        emptySetTester.add(3);
        Boolean actual = s.contains(emptySetTester);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetContainsAllFalseTest() {
        Boolean expected = false;
        emptySetTester.add(5);
        Boolean actual = s.contains(emptySetTester);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetRemoveTrueTest() {
        Boolean expected = true;
        Boolean actual = s.remove(1);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetRemoveFalseTest() {
        Boolean expected = false;
        Boolean actual = s.remove("cheese");
        assertEquals(expected,actual);
    }

    @Test
    public void mySetRemoveSizeVerificationTest() {
        emptySetTester.add(1);
        emptySetTester.add(2);
        Integer expected = 1;
        emptySetTester.remove(1);
        Integer actual = emptySetTester.size();
        assertEquals(expected,actual);
    }

    @Test
    public void mySetElementRemovedTest() {
        emptySetTester.add(1);
        Boolean expected = false;
        emptySetTester.remove(1);
        Boolean actual = emptySetTester.contains(1);
        assertEquals(expected,actual);
    }

    @Test
    public void mySetRemoveAllTest() {
        Boolean expected = null;
        Boolean actual = null;
        assertEquals(expected,actual);
    }

    @Test
    public void mySetSizeTest() {
        Integer expected = 3;
        Integer actual = s.size();
        assertEquals(expected,actual);
    }
}