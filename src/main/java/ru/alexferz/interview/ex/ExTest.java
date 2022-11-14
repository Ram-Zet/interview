package ru.alexferz.interview.ex;

import java.io.IOException;

public class ExTest {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("a");
            } finally {
                if (true) {
                    throw new IOException("b");
                }
                System.err.println("c");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
