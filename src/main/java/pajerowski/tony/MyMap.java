package pajerowski.tony;

import java.util.*;
import java.util.HashMap;
/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class MyMap<K,V> {  // need to use a linked list to implement map

    static class Node<K,V> implements Map.Entry<K,V> {
        private K key;
        private V value;
        MyMap.Node<K,V> next;

        Node(int hash, K key, V value, MyMap.Node<K,V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey()        { return key; }
        public V getValue()      { return value; }
        public String toString() { return key + "=" + value; }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?,?> e = (Map.Entry<?,?>)o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }
}
