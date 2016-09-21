package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.trim().length() > 0) {
            char[] array = s.toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == ' ' && array[i + 1] != ' ') {
                    array[i + 1] = Character.toUpperCase(array[i + 1]);
                }
            }
            System.out.println(String.valueOf(array));
        }
    }
}
