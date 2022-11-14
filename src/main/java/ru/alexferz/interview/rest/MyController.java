package ru.alexferz.interview.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private long counter = 0;

    @PostMapping
    public Long doSomeWork() {
        counter++;
        //some work executed
        return counter;
    }
}
