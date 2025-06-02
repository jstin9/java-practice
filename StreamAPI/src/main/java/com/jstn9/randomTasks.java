package com.jstn9;

import com.jstn9.models.User;

import java.util.*;
import java.util.stream.Collectors;

public class randomTasks {
    public static void main(String[] args) {

        System.out.println("Task 1. Combining lines into one");
        List<String> taskOneList = Arrays.asList("Java", "Stream", "API", "is", "powerful");
        System.out.println("Task 1 List: " + taskOneList);
        String line = taskOneList.stream().reduce((x, y) -> x + " " + y).orElse(" ");
        System.out.println(line);

        System.out.println();

        System.out.println("Task 2. Counting words longer than 5 characters");
        List<String> taskTwoList = Arrays.asList("programming", "code", "stream", "filter", "Java", "lambda");
        System.out.println("Task 2 List: " + taskTwoList);
        long count = taskTwoList.stream().filter(x -> x.length() > 5).count();
        System.out.println(count);

        System.out.println();

        System.out.println("Task 3. Converting numbers to even/odd strings");
        List<Integer> taskThreeList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Task 3 List: " + taskThreeList);
        List<String> taskThreeListNew = taskThreeList.stream().map(x -> x % 2 == 0 ? "even" : "odd").toList();
        System.out.println(taskThreeListNew);

        System.out.println();

        System.out.println("Task 4. Extract the shortest and longest word");
        List<String> taskFourList = Arrays.asList("sun", "moon", "planet", "galaxy", "star");
        System.out.println("Task 4 List: " + taskFourList);
        String shortest = taskFourList.stream().min(Comparator.comparingInt(String::length)).orElse("");
        String longest = taskFourList.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Shortest word: " + shortest + ", longest word: " + longest);

        System.out.println();

        System.out.println("Task 5. Find the sum of the squares of even numbers");
        List<Integer> taskFiveList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("Task 5 List: " + taskFiveList);
        int sum = taskFiveList.stream().filter(x -> x % 2 == 0).map(x -> x * x).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the squares of even numbers: " + sum);

        System.out.println();

        System.out.println("Task 6. Check if all numbers are even");
        List<Integer> taskSixList = Arrays.asList(2,4,6,8,10);
        System.out.println("Task 6 List: " + taskSixList);
        boolean isAllEven = taskSixList.stream().allMatch(x -> x % 2 == 0);
        System.out.println("All numbers are even: " + (isAllEven ? "Yes" : "No"));

        System.out.println();

        System.out.println("Task 7. Filtering numbers that are multiples of 3 and 5");
        List<Integer> taskSevenList = new ArrayList<>();
        for (int i = 1; i <= 50; i++) { // Filling the list from 1 to 50
            taskSevenList.add(i);
        }
        System.out.println("Task 7 List: " + taskSevenList);
        taskSevenList = taskSevenList.stream().filter(x -> x % 3 == 0 && x % 5 == 0).toList();
        System.out.println("Task 7 List after filtering: " + taskSevenList);

        System.out.println();

        System.out.println("Task 8. Create a map: word → number of characters");
        List<String> taskEightList = Arrays.asList("sky", "forest", "cloud", "sun");
        System.out.println("Task 8 List: " + taskEightList);
        Map<String, Integer> taskEightMap = taskEightList.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(taskEightMap);

        System.out.println();

        // need more tasks like this one
        System.out.println("Task 9. Find the most common word in the list");
        List<String> taskNineList = Arrays.asList("java", "java", "kotlin", "scala", "java", "kotlin");
        System.out.println("Task 9 List: " + taskNineList);
        String mostCommonWord = taskNineList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
        System.out.println("Most common word is: " + mostCommonWord);

        System.out.println();

        System.out.println("Task 10. Sum all numbers using reduce");
        int sumOfTaskSevenList = taskSevenList.stream().reduce(Integer::sum).orElse(0);
        System.out.println("Sum all numbers in Task 7 List: : " + sumOfTaskSevenList);

        System.out.println();

        System.out.println("Task 11. Find the longest word using reduce");
        List<String> taskElevenList = Arrays.asList("monitor", "keyboard", "laptop", "headset");
        System.out.println("Task 11 List: " + taskElevenList);
        String longestWord = taskElevenList.stream().reduce((acc, str) -> acc.length() > str.length() ? acc : str).orElse("");
        System.out.println("Longest word: " + longestWord);

        System.out.println();

        System.out.println("Task 12. Concatenate strings using reduce");
        List<String> taskTwelveList = Arrays.asList("a", "b", "c", "d");
        System.out.println("Task 12 List: " + taskTwelveList);
        String concatenatedString = taskTwelveList.stream().reduce(String::concat).orElse("");
        System.out.println("Concatenated string: " + concatenatedString);

        System.out.println();

        System.out.println("Task 13. Combine list of words into acronym using reduce");
        List<String> taskThirteenList = Arrays.asList("Don't", "Repeat", "Yourself");
        System.out.println("Task 13 List: " + taskThirteenList);
        String combinedString = taskThirteenList.stream().map(x -> x.substring(0,1)).reduce(String::concat).orElse("");
        System.out.println(combinedString);

        System.out.println();

        System.out.println("Task 14. Select all active users over 18 years old");
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Danya", 19, true);
        User user2 = new User(2, "Andrew", 16, false);
        User user3 = new User(3, "Vladislav", 42, true);
        User user4 = new User(4, "Alex", 12, true);
        User user5 = new User(5, "Bob", 14, true);


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        System.out.println("Task 14 Users List: ");
        for(User user : users){
            System.out.println(user);
        }

        System.out.println("After filtering: ");
        users.stream().filter(x -> x.isActive() && x.getAge() >= 18).forEach(System.out::println);

        System.out.println();

        System.out.println("Task 15. Average user age");
        double avgUserAge = users.stream().mapToInt(User::getAge).average().orElse(0.0);
        System.out.println("Average user age: " + avgUserAge);

        System.out.println();

        System.out.println("Task 16. Sorting users by age with Comparable interface");
        users.stream().sorted().forEach(System.out::println);

        System.out.println();

        System.out.println("Task 17. Sorting users by A-Z");
        users.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);

        System.out.println();

        System.out.println("Task 18. Sorting users by Z-A");
        users.stream().sorted(Comparator.comparing(User::getName, Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println();

        System.out.println("Task 19. Check if all users are active");
        boolean isAllUsersActive = users.stream().allMatch(User::isActive);
        System.out.println("All are active: " + isAllUsersActive);

        System.out.println();

        System.out.println("Task 20. Grouping users by id and names");
        Map<Integer, String> groupUser = users.stream().collect(Collectors.toMap(User::getId, User::getName));
        System.out.println(groupUser);

        System.out.println("Map output with method forEach in map");
        groupUser.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));

        System.out.println("Map output with for loop");
        for(Map.Entry<Integer,String> entry : groupUser.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
