package com.javarush.test.level02.lesson08.task05;

/* Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
*/
public class Solution {
    public static void print3(String s) {
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
