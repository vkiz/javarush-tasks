package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max1 = a;
        int max2 = c;

        if (b > a) {
            max1 = b;
        }
        if (d > c) {
            max2 = d;
        }
        if (max1 > max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }
    }
}
