package datastructures.hashmaphashfunctions.customhashmap;

import java.util.LinkedList;

class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16; // Default initial capacity
    private LinkedList<Node<K, V>>[] table;
    private int size;

    // Node class to store key-value pairs
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the hash map with a default capacity
    public HashMap() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    // Hash function to compute the index for a given key
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Insert key-value pair into the hash map
    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check if the key already exists, if so, update the value
        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value; // Update value for existing key
                return;
            }
        }

        // Add a new key-value pair if key doesn't exist
        table[index].add(new Node<>(key, value));
        size++;
    }

    // Get the value associated with a key
    public V get(K key) {
        int index = hash(key);

        if (table[index] == null) {
            return null;
        }

        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return node.value; // Return the value for the key
            }
        }

        return null; // Key not found
    }

    // Remove a key-value pair from the hash map
    public void remove(K key) {
        int index = hash(key);

        if (table[index] == null) {
            return;
        }

        Node<K, V> toRemove = null;
        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                toRemove = node;
                break;
            }
        }

        if (toRemove != null) {
            table[index].remove(toRemove); // Remove the node from the list
            size--;
        }
    }

    // Get the size of the hash map
    public int size() {
        return size;
    }

    // Check if the hash map contains the given key
    public boolean containsKey(K key) {
        int index = hash(key);

        if (table[index] == null) {
            return false;
        }

        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return true;
            }
        }

        return false;
    }
}
