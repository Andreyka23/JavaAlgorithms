package ru.geekbrains.algorithms.lesson5;

import com.sun.jdi.InternalException;

public class Exponentiation {

    // TASK 1
    public static void main(String[] args) {
        try {
            System.out.println("2 ^ 5 = " + exponentiation(2, 5)); // 32
            System.out.println("2 ^ -2 = " + exponentiation(2, -2)); // 0.25
            System.out.println("2 ^ 0 = " + exponentiation(2, 0)); // 1
            System.out.println("0 ^ 2 = " + exponentiation(0, 2)); // 0
            System.out.println("0 ^ -2 = " + exponentiation(0, -2)); // IllegalArgumentException
        } catch (IllegalArgumentException err) {
            System.out.println("IllegalArgumentException " + err.getMessage());
        }
    }

    public static double exponentiation(double number, int power) throws IllegalArgumentException {
        if (number == 0)
            if (power > 0)
                return 0;
            else
                throw new IllegalArgumentException("Invalid power " + power);

        if (power < 0) {
            return 1 / (number * exponentiation(number, -power - 1));
        } else if (power > 0) {
            return number * exponentiation(number, --power);
        } else {
            return 1;
        }

    }
}
