package pajerowski.tony;


import java.util.Arrays;

/**
 * Created by anthonypajerowski on 2/22/17.
 */

public class MyMap<K, V> {
    private int size;
    private int capacity = 10;

    private MyEntry<K, V>[] values = new MyEntry[capacity];

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                insert = false;
            }
        }
        if (insert) {
            autoResize();
            values[size++] = new MyEntry<K, V>(key, value);
        }
    }

    public int size() {
        return size;
    }

    private void autoResize() {
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i] = null;
                size--;
                shrinkArray(i);
            }
        }
    }

    private void shrinkArray(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }

    public MySet<K> keySet() {
        MySet<K> set = new MySet<K>();
        for (int i = 0; i < size; i++) {
            set.add(values[i].getKey());
        }
        return set;
    }
}