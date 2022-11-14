package ru.alexferz.algorithm;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input matrix quantity: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i < j ? 1 : 2);
            }
            System.out.println();
        }
    }
}


//  22222
//  21112
//  21112
//  21112
//  22222
