package ru.geekbrains.algorithms.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Кошелек",   1, 10000));
        items.add(new Item("Книга",   2, 1000));
        items.add(new Item("Ноутбук",   4, 50000));
        items.add(new Item("Термос",   3, 2000));
        items.add(new Item("Зонт",   3, 3000));

        Backpack backpack = new Backpack(8);
        backpack.calcBestSet(items);

        for (Item item : backpack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println("Total best price is " + backpack.getBestPrice());
    }

}
