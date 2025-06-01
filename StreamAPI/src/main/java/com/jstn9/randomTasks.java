package com.jstn9;

import java.util.*;
import java.util.stream.Collectors;

public class randomTasks {
    public static void main(String[] args) {

        System.out.println("Task 1. Combining lines into one");
        List<String> taskOneList = Arrays.asList("Java", "Stream", "API", "is", "powerful");
        System.out.println("taskOneList: " + taskOneList);
        String line = taskOneList.stream().reduce((x, y) -> x + " " + y).orElse(" ");
        System.out.println(line);

        System.out.println();

        System.out.println("Task 2. Counting words longer than 5 characters");
        List<String> taskTwoList = Arrays.asList("programming", "code", "stream", "filter", "Java", "lambda");
        System.out.println("taskTwoList: " + taskTwoList);
        long count = taskTwoList.stream().filter(x -> x.length() > 5).count();
        System.out.println(count);

        System.out.println();

        System.out.println("Task 3. Converting numbers to even/odd strings");
        List<Integer> taskThreeList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("taskThreeList: " + taskThreeList);
        List<String> taskThreeListNew = taskThreeList.stream().map(x -> x % 2 == 0 ? "even" : "odd").toList();
        System.out.println(taskThreeListNew);

        System.out.println();

        System.out.println("Task 4. Extract the shortest and longest word");
        List<String> taskFourList = Arrays.asList("sun", "moon", "planet", "galaxy", "star");
        System.out.println("taskFourList: " + taskFourList);
        String shortest = taskFourList.stream().min(Comparator.comparingInt(String::length)).orElse("");
        String longest = taskFourList.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Shortest word: " + shortest + ", longest word: " + longest);

        System.out.println();

        System.out.println("Task 5. Find the sum of the squares of even numbers");
        List<Integer> taskFiveList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("taskFiveList: " + taskFiveList);
        int sum = taskFiveList.stream().filter(x -> x % 2 == 0).map(x -> x * x).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the squares of even numbers: " + sum);

        System.out.println();

        System.out.println("Task 6. Check if all numbers are even");
        List<Integer> taskSixList = Arrays.asList(2,4,6,8,10);
        System.out.println("taskSixList: " + taskSixList);
        boolean isAllEven = taskSixList.stream().allMatch(x -> x % 2 == 0);
        System.out.println("All numbers are even: " + (isAllEven ? "Yes" : "No"));

        System.out.println();

        System.out.println("Task 7. Filtering numbers that are multiples of 3 and 5");
        List<Integer> taskSevenList = new ArrayList<>();
        for (int i = 1; i <= 50; i++) { // Filling the list from 1 to 50
            taskSevenList.add(i);
        }
        System.out.println("taskSevenList: " + taskSevenList);
        taskSevenList = taskSevenList.stream().filter(x -> x % 3 == 0 && x % 5 == 0).toList();
        System.out.println("taskSevenList after filtering: " + taskSevenList);

        System.out.println();

        System.out.println("Task 8. Create a map: word → number of characters");
        List<String> taskEightList = Arrays.asList("sky", "forest", "cloud", "sun");
        System.out.println("taskEightList: " + taskEightList);
        Map<String, Integer> taskEightMap = taskEightList.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(taskEightMap);

        System.out.println();

        // need more tasks like this one
        System.out.println("Task 9. Find the most common word in the list");
        List<String> taskNineList = Arrays.asList("java", "java", "kotlin", "scala", "java", "kotlin");
        System.out.println("taskNineList: " + taskNineList);
        String mostCommonWord = taskNineList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
        System.out.println("Most common word is: " + mostCommonWord);

    }
}
