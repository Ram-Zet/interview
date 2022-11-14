package ru.alexferz.interview.immutability;

import java.time.LocalDate;

public class MyClass {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2022, 1, 1);
        doSmth(d);
        System.out.println(d);
    }
    public static void doSmth(LocalDate date) {
        date.plusDays(1).plusMonths(1);
    }
}
