package ru.alexferz.interview.streams;

import java.util.List;

public class PeekForEach {
    public void method() {
        List<Integer> list = List.of(1,2,3,40,50,60,70);

        list.stream()
                .filter(e -> e > 2)
                .peek(System.out::println);
        list.stream()
                .filter(e -> e > 2)
                .forEach(System.out::println);
    }
}
