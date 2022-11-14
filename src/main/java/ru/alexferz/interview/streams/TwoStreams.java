package ru.alexferz.interview.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStreams {
    public void method() {
        List<Integer> list = List.of(1, 2, 3, 4, 50, 60, 70, 80);
        Stream<Integer> myStream = list.stream()
                .filter(e -> e > 2);
        List<Integer> moreThan2List = myStream
                .collect(Collectors.toList());
        List<Integer> andLessThan60List = myStream
                .filter(e -> e < 60)
                .collect(Collectors.toList());
    }
}
