package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOfEvenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> result = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(result); // Output: [apple]


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result); // Output: [2, 4, 6, 8, 10]

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        fruits.stream()
                .forEach(fruit -> System.out.println("I love " + fruit));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum); // Output: 15



    }
}
