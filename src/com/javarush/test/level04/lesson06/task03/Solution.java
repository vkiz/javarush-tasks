package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int first = a, second = b, third = c;

        if (a >= b && a >= c) {
            first = a;
            if (b >= c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b >= a && b >= c) {
            first = b;
            if (a >= c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else if (c >= a && c >= b) {
            first = c;
            if (a >= b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
