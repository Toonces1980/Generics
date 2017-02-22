package pajerowski.tony;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MySet<E> implements Iterable<E>{
    private Object[] mySetBackingArray;
    int currentElements;

    MySet() {
        mySetBackingArray = new Object[10];
        currentElements = 0;
    }

    MySet(int initialCapacity){
        mySetBackingArray = new Object[initialCapacity];
        currentElements = 0;
    }

    MySet(Collection<? extends E> c) {}


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
        for(Object backingElem : mySetBackingArray){
            if (o!=null && o.equals(backingElem)){
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection <?> c){
        return false;
    }

    public boolean	equals(Object o) {
        return false;
    }

    public  int	hashCode() {return -1;}

    public boolean	isEmpty() {
        return false;
    }

    boolean	remove(Object o) {
        return false;
    }

    boolean	removeAll(Collection<?> c) {
        return false;
    }

    boolean	retainAll(Collection<?> c) {
        return false;
    }

    int	size() {
        return currentElements;
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


//
//    private E[] backingArray;
//    private int numElements;
//
//    /**
//     * Constructor for objects of class MySet
//     */
//    public MySet()
//    {
//        backingArray=(E[]) new Object[5];
//        numElements=0;
//    }
//
//    }
//    public void clear(){
//        E[] newArray=(E[])new Object[backingArray.length];
//        numElements=0;
//        backingArray=newArray;
//    }
//    public boolean equals(Object o){
//        if(o instanceof Set &&(((Set)o).size()==numElements)){
//            for(E elem:(Set<E>)o){
//                if (this.contains(o)==false){
//                    return false;
//                }
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean contains(Object o){
//        for(E backingElem:backingArray){
//            if (o!=null && o.equals(backingElem)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean containsAll(Collection<?> c){
//        for(E elem:(Set<E>)c){
//            if(!(this.contains(elem))){
//                return false;
//            }
//        }
//        return true;
//    }
//    public int hashCode(){
//        int sum=0;
//        for(E elem:backingArray){
//            if(elem!=null){
//                sum=sum+elem.hashCode();
//            }
//        }
//        return sum;
//    }
//    public boolean isEmpty(){
//        if(numElements==0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public boolean remove(Object o){
//        int i=0;
//        for(Object elem:backingArray){
//            if(o!=null && o.equals(elem)){
//                backingArray[i]=null;
//                numElements=numElements-1;
//                E[] newArray=Arrays.copyOf(backingArray,backingArray.length-1);
//                return true;
//            }
//            i=i+1;
//        }
//        return false;
//    }
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
//    public int size(){
//        return numElements;
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
//




