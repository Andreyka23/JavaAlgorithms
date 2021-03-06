package ru.geekbrains.algorithms.lesson4;

import java.util.Iterator;

public interface LinkedList<E> extends Iterable<LinkedList.Node<E>> {

    /**
     * O(1)
     * add element to the beginning of list
     * @param value
     */
    void insertFirst(E value);

    /**
     * O(1)
     * @return remove element from the beginning of list
     */
    E removeFirst();

    /**
     * O(n)
     * @param value
     * @return
     */
    boolean remove(E value);

    /**
     * O(n)
     * @param value
     * @return
     */
    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    Iterator<Node<E>> iterator();


    class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    class ListIterator<E> implements Iterator<Node<E>> {

        private LinkedList.Node<E> current;

        public ListIterator(LinkedList.Node<E> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public LinkedList.Node<E> next() {
            LinkedList.Node<E> temp = current;
            current = current.next;
            return temp;
        }
    }
}
