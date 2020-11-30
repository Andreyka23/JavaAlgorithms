package ru.geekbrains.algorithms.lesson8;

public class LinkedHashTableImpl<K, V> extends HashTableImpl<K, V> {

    public LinkedHashTableImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean put(K key, V value) {
        int index = hash(key);

        if (size == maxSize) {
            return false;
        }

        if (data[index] == null) {
            data[index] = new Node<>(key, value);
            size++;
            return true;
        }

        Node<K, V> node = data[index];
        while (node.getNextNode() != null) {
            if (node.getKey().equals(key)) {
                node.setValue(value);
                return true;
            }
            node = node.getNextNode();
        }

        node.setNextNode(new Node<>(key, value));
        return true;
    }

    public V get(K key) {
        int index = hash(key);
        if (data[index] == null) {
            return null;
        }
        Node<K, V> node = data[index];
        while (node != null && !node.getKey().equals(key)) {
            node = node.getNextNode();
        }
        if (node == null) {
            return null;
        }
        return node.getValue();
    }

    @Override
    public V remove(K key) {
        int index = hash(key);
        if (data[index] == null) {
            return null;
        }

        Node<K, V> current = data[index];
        Node<K, V> previous = null;
        while (current != null) {
            if (current.getKey().equals(key)) {
                if (previous == null) {
                    data[index] = current.getNextNode();
                    if (current.getNextNode() == null) {
                        size--;
                    }
                } else
                    previous.setNextNode(current.getNextNode());

                return current.getValue();
            }
            previous = current;
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public void display() {
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i + " = ");
            Node<K, V> current = data[i];
            while (current != null) {
                System.out.print(current + (current.getNextNode() != null ? ", " : ""));
                current = current.getNextNode();
            }
            System.out.println();
        }
        System.out.println("----------");
    }

}
