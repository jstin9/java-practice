package com.jstn9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class W3resourceStreamAPI {
    public static void main(String[] args) {

        System.out.println("Task 1. Calculate average of integers using streams");
        List<Integer> taskOneList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("taskOneList: " + taskOneList);
        double avg = taskOneList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average of taskOneList: " + avg);

        System.out.println();

        System.out.println("Task 2. Convert strings to upper/lowercase using streams");
        List<String> taskTwoList = Arrays.asList("DAY", "NIGHT", "AFTERNOON");
        System.out.println("taskTwoList: " + taskTwoList);
        taskTwoList.stream().map(String::toLowerCase).forEach(System.out::println);

        System.out.println();

        System.out.println("Task 3. Sum even and odd numbers in list using streams");
        System.out.println("taskOneList: " + taskOneList);
        int sumEven = taskOneList.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        int sumOdd = taskOneList.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sumEven + "\nSum of odd numbers: " + sumOdd);

        System.out.println();

        System.out.println("Task 4. Remove duplicates from list using streams");
        List<Integer> taskFourList = Arrays.asList(2, 3, 3, 4, 4, 7, 8, 9, 9);
        System.out.println("taskFourList: " + taskFourList);
        taskFourList = taskFourList.stream().distinct().toList();
        System.out.println(taskFourList);

        System.out.println();

        System.out.println("Task 5. Count strings starting with letter using streams");
        List<String> taskFiveList = Arrays.asList("Computer", "Monitor", "Keyboard", "Mouse", "Microphone", "Cable");
        System.out.println("taskFiveList: " + taskFiveList);
        long countM = taskFiveList.stream().filter(str -> str.charAt(0) == 'M').count();
        System.out.println("Words starting with a letter M: " + countM);
        long countC = taskFiveList.stream().filter(str -> str.startsWith(String.valueOf('C'))).count();
        System.out.println("Words starting with a letter C: " + countC);

        System.out.println();

        System.out.println("Task 6. Sort strings A-Z and Z-A using streams");
        taskFiveList = taskFiveList.stream().sorted(String::compareTo).toList();
        System.out.println("taskFiveList sort A-Z: " + taskFiveList);
        taskFiveList = taskFiveList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("taskFiveList sort Z-A: " + taskFiveList);

        System.out.println();

        System.out.println("Task 7. Find max and min in list using streams");
        List<Integer> taskSevenList = Arrays.asList(5, 18, 94, 0, 1, -16, -126, 46, 435);
        System.out.println("taskSevenList: " + taskSevenList);
        int max = taskSevenList.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = taskSevenList.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Min: " + min + ", Max: " + max);

        System.out.println();

        System.out.println("Task 8. Find 2nd smallest/largest using streams");
        int smallest = taskSevenList.stream().distinct().sorted().skip(1).findFirst().orElse(0);
        System.out.println("Smallest 2nd number in taskSevenList: " + smallest);

    }
}