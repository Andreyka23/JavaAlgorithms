package ru.geekbrains.algorithms.lesson2;

import java.util.Arrays;
import java.util.Random;

public class TestArray {

    private static final int CAPACITY = 100000;

    public static void main(String[] args) {
        testDynamicArray();
    }

    private static Array<Integer> genereateArray(Array<Integer> data) {
        Random rd = new Random();
        for (int i = 0; i < CAPACITY; i++) {
            data.add(rd.nextInt(1000));
        }
        return data;
    }

    private static Array<Integer> copyArray(Array<Integer> data) {
        Array<Integer> data2 = new ArrayImpl<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            data2.add(data.get(i));
        }
        return data2;
    }

    private static void testDynamicArray() {

        Array<Integer> data = new ArrayImpl<>(CAPACITY);
        data.display();
        data = genereateArray(data);
        data.display();

        Array<Integer> data2 = copyArray(data);
        Array<Integer> data3 = copyArray(data);

        System.out.println("Сортировка пузырьком");
        long m = System.currentTimeMillis();
        data.sortBubble();
        System.out.println((double) (System.currentTimeMillis() - m) + "ms");
        data.display();

        System.out.println("Сортировка методом выбора");
        m = System.currentTimeMillis();
        data2.sortSelect();
        System.out.println((double) (System.currentTimeMillis() - m) + "ms");
        data2.display();

        System.out.println("Сортировка методом вставки");
        m = System.currentTimeMillis();
        data3.sortInsert();
        System.out.println((double) (System.currentTimeMillis() - m) + "ms");
        data3.display();

    }
}
