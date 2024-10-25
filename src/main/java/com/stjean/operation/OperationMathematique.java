package com.stjean.operation;

import java.util.Arrays;

public class OperationMathematique {
    public boolean estPositif(int nombre) {
        return nombre > 0;
    }
    public int factorial(int number) {
        if (number < 0) throw new IllegalArgumentException("Number must be non-negative");
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static Integer[] sort(Integer[] lists) {
        Arrays.sort(lists, (a, b) -> b - a);
        return lists;
    }
}
