package ru.alexferz.interview.task;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Найти первый неповторяющийся элемент в наборе целых чисел.
//Например, для набора {4,5,7,5,4,9,4} должно вернуться значение 7
//~20 мин
//https://interview.cups.online/live-coding/?room=7af61e60-d70d-49b3-83ac-118a8c5ee135

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,7,5,4,9,4};
        int[] arr2 = null;
        int[] arr3 = new int[0];
        System.out.println(getFirstUnique(arr));
    }

    public static int getFirstUnique(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Wrong array");
        }
        Map<Integer, Long> countByValue = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        for (int i : arr) {
            if (countByValue.get(i) == 1) {
                return i;
            }
        }
        throw new IllegalArgumentException("No unique value");
    }
}
