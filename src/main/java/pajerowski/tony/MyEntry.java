package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/22/17.
 */

public class MyEntry<K,V> {  // need to use a linked list to implement map? also set to ensure a single copy of key?

    private final K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}