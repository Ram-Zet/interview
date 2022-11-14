package ru.alexferz.algorithm;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello world";
        String s1 = "   fly me   to   the moon  ";
        System.out.println(lastWordLength(s));
        System.out.println(lastWordLength(s1));
    }

    private static int lastWordLength(String s) {
        char[] chars = s.toCharArray();
        int i = s.length() - 1;
        for (; i >= 0 && chars[i] == ' '; i--) {
        }
        if (i == 0) throw new IllegalArgumentException("В строке нет символов");
        int counter = 0;
        for (; i >= 0 && chars[i] != ' '; i--, counter++) {
        }
        return counter;
    }
}
