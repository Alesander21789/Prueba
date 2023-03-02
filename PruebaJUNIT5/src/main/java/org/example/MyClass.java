package org.example;

import java.util.List;

public class MyClass {

    public void addToList(List<String> list, String element) {
        if (list == null) {
            throw new IllegalArgumentException("La lista no puede ser nula.");
        }
        list.add(element);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int a) {
        return a > 0;
    }

    public static void throwException() {
        throw new RuntimeException("This is an exception");
    }

    public static String[] createArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }
        return new String[size];
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return !isEven(number);
    }

    public int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return numerator / denominator;
    }
    public void failMethod() {
        throw new RuntimeException("Este método siempre falla.");
    }

    public String getString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
    public void clearList(List<String> list) {
        list.clear();
    }


}
