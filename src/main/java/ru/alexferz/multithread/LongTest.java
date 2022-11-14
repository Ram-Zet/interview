package ru.alexferz.multithread;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongTest {
    static long counter;
    static Set<Long> counterss = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) throws Exception {
        for (int i = 0; i< 1000; i++) {
            new Thread(task1()).start();
            new Thread(task2()).start();
        }

        Thread.sleep(10000);
        System.out.println(counterss);

    }

    private static Runnable task1() {
        return () -> {
            counter = 100L;
            counterss.add(counter);
        };
    }

    private static Runnable task2() {
        return () -> {
            counter = 99999999L;
            counterss.add(counter);
        };
    }


}
