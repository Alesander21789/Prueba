package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public  String concatenate(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static int[] getArray() {
        return new int[] {1, 2, 3};
    }

    public  Iterable<String> getIterable() {
        return new java.util.ArrayList<String>() {{
            add("Hello");
            add("World");
            add("!");
        }};
    }

    public java.util.List<String> getLines() {
        return java.util.Arrays.asList("This is line 1", "This is line 2");
    }

    public  Object getObject() {
        return new Object();
    }

    public  String getNull() {
        return null;
    }

}