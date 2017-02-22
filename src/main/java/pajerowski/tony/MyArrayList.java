package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterator{
    private Object[] myArrayList;
    private int initialCapacity = 10;
    private int currentCapacity;
    public int elementsFilled = 0;

    public MyArrayList() {
        myArrayList = new Object[initialCapacity];
        currentCapacity = initialCapacity;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException();
        } else if (initialCapacity >= 0 && initialCapacity <= 10) {
            myArrayList = new Object[this.initialCapacity];
            currentCapacity = myArrayList.length;
        } else myArrayList = new Object[initialCapacity];
        currentCapacity = initialCapacity;
    }

    protected Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public int size() {
        return elementsFilled;
    }

    public E get(int index) {
        if (index > elementsFilled) {
            throw new IndexOutOfBoundsException();
        } else return (E) myArrayList[index];
    }

    public E set(int index, E element) {
        if (index > elementsFilled) {
            throw new IndexOutOfBoundsException();
        } else {
            E oldValue = (E) myArrayList[index];
            myArrayList[index] = element;
            return (E) oldValue;
        }
    }

    public boolean add(E e) {
        if (elementsFilled <= currentCapacity) {
            myArrayList[elementsFilled] = e;
            elementsFilled++;
            return true;
        } else {
            Object[] temp = myArrayList;
            myArrayList = Arrays.copyOf(temp, temp.length + initialCapacity);
            currentCapacity = myArrayList.length + initialCapacity;
            elementsFilled++;
            return true;
        }
    }

    public E remove(int index) {
        if (index > elementsFilled || index < 0) {
            throw new IndexOutOfBoundsException();
        } else  {


            Object[] temp = new Object[myArrayList.length + myArrayList.length-1];
            temp = (Arrays.copyOfRange(myArrayList,0,index-1));
            myArrayList = Arrays.copyOf(temp, temp.length + initialCapacity);
            currentCapacity = myArrayList.length + initialCapacity;
            elementsFilled++;
            //return true;


            myArrayList = Arrays.copyOfRange(myArrayList,0,index-1);
        }
            return null;
    }

    public void clear() {
        myArrayList = new Object[initialCapacity];
    }

    public boolean isEmpty() {
        if(elementsFilled == 0) {
            return true;
        } else return false;
    }

    public boolean contains(Object o) {
        for ( int i = 0; i < size(); i++) {
            if (o.equals(get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }
}