package ru.geekbrains.algorithms.lesson3.myqueue;

public interface Deque<E> extends Queue<E> {

    boolean insertRight(E value);

    E removeLeft();
}
