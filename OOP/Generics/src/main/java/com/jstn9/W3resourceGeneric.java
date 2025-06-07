package com.jstn9;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class W3resourceGeneric {
    public static void main(String[] args) {
        // 1. Compare Two Generic Arrays
        // Write a Java program to create a generic method that takes two arrays
        // of the same type and checks if they have the same elements in the same order.

        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        String[] array3 = {"a", "b", "c", "d", "e"};
        String[] array4 = {"a", "b", "c", "d", "e"};

        System.out.println("Task 1.");
        System.out.println("Original arrays:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        System.out.println("array3: " + Arrays.toString(array3));
        System.out.println("array4: " + Arrays.toString(array4));

        System.out.println("Compare array1 and array2: " + compare(array1, array2));
        System.out.println("Compare array3 and array4: " + compare(array3, array4));
        System.out.println("Compare array1 and array4: " + compare(array1, array4));

        System.out.println();

        // 2. Sum Even and Odd in List
        // Write a Java program to create a generic method that takes a list
        // of numbers and returns the sum of all the even and odd numbers.

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0);
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Task 2.");
        sumOfAllNumbers(doubleList);
        sumOfAllNumbers(integerList);

        System.out.println();

        // 3. Find Index of Target in Generic List
        // Write a Java program to create a generic method that takes a list
        // of any type and a target element. It returns the index
        // of the first occurrence of the target element in the list.
        // Return -1 if the target element cannot be found.

        int element = 6;
        System.out.println("Task 3.");
        System.out.println("List: " + integerList);
        System.out.println("Index of element " + element + ": " + getIndexOfElement(integerList, element));

        System.out.println();

        // 4. Reverse Generic List
        // Write a Java program to create a generic method that takes a list
        // of any type and returns it as a new list with the elements in reverse order.

        System.out.println("Task 4.");
        System.out.println("List: " + integerList);
        System.out.println("Reversed list: " + reverseList(integerList));

        System.out.println();

        // 5. Merge Two Lists Alternately
        // Write a Java program to create a generic method that takes two lists
        // of the same type and merges them into a single list.
        // This method alternates the elements of each list.

        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);

        System.out.println("Task 5.");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        List<?> mergedList = mergeLists(list1, list2);
        System.out.println("Merged list: " + mergedList);

        System.out.println();

        // 6. Filter List by Predicate
        // Write a Java program to create a generic method that takes a list
        // of any type and a predicate. It returns an array list containing
        // only elements that satisfy the predicate.

        Predicate<Integer> predicate = x -> x % 2 == 0;

        System.out.println("Task 6.");
        System.out.println("List: " + integerList);
        System.out.println("List after satisfy the predicate: " + satisfyPredicate(integerList, predicate));

        System.out.println();

        // 7. Print Generic Map Entries
        // Write a Java program to create a generic method that takes a map
        // of any type and prints each key-value pair.

        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
        System.out.println("Task 7.");
        System.out.println("Map: " + map);
        printMap(map);
    }

    // Task 1
    public static <T> boolean compare(T[] firstArray, T[] secondArray) {
        return Arrays.equals(firstArray, secondArray);
    }

    // Task 2
    public static <T extends Number> void sumOfAllNumbers(List<T> array) {
        double evenSum = 0;
        double oddSum = 0;

        for (Number number : array) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }

        System.out.println("Original array: " + array);
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);

    }

    // Task 3
    public static <T> int getIndexOfElement(List<T> list, T element) {
        return list.indexOf(element);
    }

    // Task 4
    public static <T> List<T> reverseList(List<T> list) {
        ArrayList<T> result = new ArrayList<>(list);
        Collections.reverse(result);
        return result;
    }

    // Task 5
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            if (i < list1.size()) {
                result.add(list1.get(i));
            }
            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }
        return result;
    }

    // Task 6
    public static <T> List<T> satisfyPredicate(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    // Task 7
    public static <K, V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}