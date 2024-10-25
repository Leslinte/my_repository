package com.stjean.operation;

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

}
