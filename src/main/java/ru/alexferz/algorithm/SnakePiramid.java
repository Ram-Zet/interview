package ru.alexferz.algorithm;

import java.util.Scanner;

public class SnakePiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            //Если строка четная
            if (i % 2 == 0) {
                //то перебираем все числа начиная от следующего
                //заканчивая максимальное плюс номер строки плюс 1
                for (int j = counter + 1; j <= counter + i + 1; j++) {
                    sb.append(j);
                    //Добавляем пробел везде, кроме после последнего числа
                    if (j < counter + i + 1) sb.append(" ");
                }
                //иначе если строка неченая
                //идем в обратную сторону
            } else {
                for (int j = counter + i + 1; j >= counter + 1; j--) {
                    sb.append(j);
                    if (j > counter + 1) sb.append(" ");
                }
            }
            System.out.println(sb);
            //Не забываем обновить счетчик - ставим максимальное число в обработанной строке
            counter = counter + i + 1;
        }
    }
}
