package pajerowski.tony;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MySet<E> implements Iterable<E>{
    private Object[] mySetBackingArray;
    private int initialCapacity;
    int currentElements = 0;

    MySet() {
        this.initialCapacity = 10;
        mySetBackingArray = new Object[10];
        currentElements = 0;
    }

    MySet(int initialCapacity){
        mySetBackingArray = new Object[initialCapacity];
        this.initialCapacity = initialCapacity;
        currentElements = 0;
    }

    public <E> boolean add(E e) {
        for (Object o : mySetBackingArray) {
            if ( o == null ? e == null : o.equals(e)) {
                return false;
            }
        }
        if (currentElements == mySetBackingArray.length) {
             Object[] newArray = Arrays.copyOf(mySetBackingArray, mySetBackingArray.length *2);
             newArray[currentElements] = e;
             mySetBackingArray = newArray;
             currentElements++;
             return true;
        }
        else {
            mySetBackingArray[currentElements] = e;
            currentElements++;
            return true;
        }
    }

    public boolean addAll(Collection<? extends E> c){
        for(E elem:c){
            this.add(elem);
        }
        return true;
    }

   public void clear(){
        Object[] newArray = (E[])new Object[mySetBackingArray.length];
        currentElements = 0;
        mySetBackingArray=newArray;
    }

    public boolean contains(Object o) {
        for (Object backingElem : mySetBackingArray){
            if (o!=null && o.equals(backingElem)){
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> c){
        for (Object elem: c){
            if(!(this.contains(elem))){
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object o) {
        for (Object elem : mySetBackingArray) {
            if (this.contains(o) == false) {
                return false;
            }
            return true;
        }
        return false;
    }

    int	size() {
        return currentElements;
    }

    public boolean isEmpty(){
        if(currentElements == 0){
            return true;
        }
        else{
            return false;
        }
    }

    boolean	remove(Object o) {
        int i=0;
        for(Object elem:mySetBackingArray){
            if(o!=null && o.equals(elem)){
                mySetBackingArray[i]=null;
                currentElements--;
                Object[] newArray=Arrays.copyOf(mySetBackingArray,mySetBackingArray.length-1);
                return true;
            }
            i++;
        }
        return false;
    }

    boolean	removeAll(Collection<?> c) {
        return false;
    }

    boolean	retainAll(Collection<?> c) {
        return false;
    }



    Object[]	toArray() {
        return null;
    }

    <T> T[]	toArray(T[] a) {
        return null;
    }


    public Iterator<E> iterator() {
        return null;
    }
}

//    public boolean removeAll(Collection<?> c){
//        for(Object elem:c){
//            this.remove(elem);
//        }
//        return true;
//
//    }
//    public boolean retainAll(Collection<?> c){
//        MySet<E> removalArray=new MySet<E>();
//        for(E arrayElem:backingArray){
//            if(arrayElem!= null && !(c.contains(arrayElem))){
//                this.remove(arrayElem);
//            }
//        }
//        return false;
//    }
//    public  <T> T[] toArray(T[] a) throws ArrayStoreException,NullPointerException{
//        for(int i=0;i<numElements;i++){
//            a[i]=(T)backingArray[i];
//        }
//        for(int j=numElements;j<a.length;j++){
//            a[j]=null;
//        }
//        return a;
//    }
//    public Object[] toArray(){
//        Object[] newArray=new Object[numElements];
//        for(int i=0;i<numElements;i++){
//            newArray[i]=backingArray[i];
//        }
//        return newArray;
//    }
//    public Iterator<E> iterator(){
//        setIterator iterator=new setIterator();
//        return iterator;
//    }
//private class setIterator implements Iterator<E>{
//    private int currIndex;
//    private E lastElement;
//    public setIterator(){
//        currIndex=0;
//        lastElement=null;
//    }
//    public boolean hasNext(){
//        while(currIndex<=numElements && backingArray[currIndex]==null){
//            currIndex=currIndex+1;
//        }
//        if (currIndex<=numElements){
//            return true;
//        }
//        return false;
//    }
//    public E next(){
//        E element=backingArray[currIndex];
//        currIndex=currIndex+1;
//        lastElement=element;
//        return element;
//    }
//    public void remove() throws UnsupportedOperationException,IllegalStateException{
//        if(lastElement!=null){
//            MySet.this.remove((Object)lastElement);
//            numElements=numElements-1;
//        }
//        else{
//            throw new IllegalStateException();
//        }
//    }
//}
//}



