package ru.geekbrains.algorithms.lesson3;

import ru.geekbrains.algorithms.lesson3.myqueue.Deque;
import ru.geekbrains.algorithms.lesson3.myqueue.DequeImpl;
import ru.geekbrains.algorithms.lesson3.myqueue.Queue;
import ru.geekbrains.algorithms.lesson3.myqueue.QueueImpl;
import ru.geekbrains.algorithms.lesson3.mystask.Stack;
import ru.geekbrains.algorithms.lesson3.mystask.StackImpl;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        // task 1
        testStack();
        testQueue();

        // task 2
        String str_to_reverse = "Hello world";
        reverseString(str_to_reverse);

        //task 3
        testDeque();
    }

    private static void testDeque() {
        System.out.println("TEST DEQUE: ");
        Deque<Integer> queue = new DequeImpl<>(3);
        // test right insert
        System.out.println("Add value 1 in queue: " + queue.insertRight(1));
        System.out.println("Add value 2 in queue: " + queue.insertRight(2));
        System.out.println("Add value 3 in queue: " + queue.insertRight(3));
        System.out.println("Add value 4 in queue: " + queue.insertRight(4));
        System.out.println("Queue size: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.removeLeft());
        }

        // test left insert
        System.out.println("Add value 5 in queue: " + queue.insert(5));
        System.out.println("Add value 6 in queue: " + queue.insert(6));
        System.out.println("Add value 7 in queue: " + queue.insert(7));
        System.out.println("Add value 8 in queue: " + queue.insert(8));
        System.out.println("Queue size: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("----------------");
    }

    private static void reverseString(String input_string) {
        System.out.println("REVERSE STRING: ");
        Stack<Character> stack = new StackImpl<>(input_string.length());
        for (int index = 0; index < input_string.length(); index++) {
            char currentChar = input_string.charAt(index);
            stack.push(currentChar);
        }

        String reverse_string = "";
        for (int index = 0; index < input_string.length(); index++) {
            reverse_string = reverse_string.concat(Character.toString(stack.pop()) );
        }
        System.out.println( reverse_string );
        System.out.println("----------------");
    }

    private static void testStack() {
        System.out.println("TEST STACK: ");
        Stack<Integer> stack = new StackImpl<>(3);
        System.out.println("Add value 1 in stack: " + addToStack(stack, 1));
        System.out.println("Add value 2 in stack: " + addToStack(stack, 2));
        System.out.println("Add value 3 in stack: " + addToStack(stack, 3));
        System.out.println("Add value 4 in stack: " + addToStack(stack, 4));

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("----------------");
    }

    private static boolean addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }

    private static void testQueue() {
        System.out.println("TEST QUEUE: ");
        Queue<Integer> queue = new QueueImpl<>(3);
        System.out.println("Add value 3 in queue: " + queue.insert(3));
        System.out.println("Add value 5 in queue: " + queue.insert(5));
        System.out.println("Add value 1 in queue: " + queue.insert(1));
        System.out.println("Add value 2 in queue: " + queue.insert(2));

        System.out.println("Queue peek: " + queue.peekHead());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is full: " + queue.isFull());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println("----------------");
    }

}
