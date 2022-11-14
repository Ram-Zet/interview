package ru.alexferz.algorithm;

public class Bytes {
    public static void main(String[] args) {
        byte[] arr1 = {1, 0, 0, 0, 0};
        byte[] arr2 = {0, 0, 1, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (byte)(arr1[i] | arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
