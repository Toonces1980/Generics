package pajerowski.tony;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MySet {

    public <E> boolean add(E e) {
        return false;
    }

    public <E> boolean adddAll(Collection<? extends E> c) {
        return false;
    }

    public void clear() {}

    public boolean contains(Object o) {
        return false;
    }

    public boolean containsAll(Collection <?> c){
        return false;
    }

    public boolean	equals(Object o) {
        return false;
    }
    //Compares the specified object with this set for equality.
    public  int	hashCode() {return -1;}
    //Returns the hash code value for this set.
    public boolean	isEmpty() {
        return false;
    }
    //Returns true if this set contains no elements.
    <E> Iterator<E> iterator() {
        return null;
    }
    //Returns an iterator over the elements in this set.
    boolean	remove(Object o) {
        return false;
    }
    //Removes the specified element from this set if it is present (optional operation).
    boolean	removeAll(Collection<?> c) {
        return false;
    }
    //Removes from this set all of its elements that are contained in the specified collection (optional operation).
    boolean	retainAll(Collection<?> c) {
        return false;
    }
    //Retains only the elements in this set that are contained in the specified collection (optional operation).
    int	size() {
        return -1;
    }
    //Returns the number of elements in this set (its cardinality).
    Object[]	toArray() {
        return null;
    }
    //Returns an array containing all of the elements in this set.
    <T> T[]	toArray(T[] a) {
        return null;
    }
   // Returns an array cont

}


