package ru.alexferz.algorithm;

//Даётся массив целых чисел и целочисленное целевое значение,
// требуется вернуть индексы двух чисел так, чтобы в сумме они составляли целевое значение.
// Каждый случай имеет ровно одно решение, и нельзя использовать один и тот же элемент дважды.
// Ответ можно вернуть в любом порядке.

import org.springframework.data.util.Pair;

import java.util.HashMap;
import java.util.Map;

//Ввод: nums = [2,7,11,15], target = 9
//Вывод: [0,1]
//Поскольку nums [0] + nums [1] == 9, мы возвращаем [0, 1].
//
//Ввод: nums = [3,2,4], target = 6
//Вывод: [1,2]
//
//Ввод: nums = [3,3], target = 6
//Вывод: [0,1]
public class NumSums {
    public static void main(String[] args) {
        int[] arr = {3,3};
        int sum = 6;
        Pair<Integer, Integer> result = getSumIndexes(arr, sum);
        System.out.println(result.getFirst() + " " + result.getSecond());
    }

    private static Pair<Integer, Integer> getSumIndexes(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                return Pair.of(map.get(sum-arr[i]), i);
            }
            map.put(arr[i], i);
        }
        throw new RuntimeException();
    }
}
