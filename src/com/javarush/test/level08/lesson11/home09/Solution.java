package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0); // январь

        Date inputDate = new Date(date);
        long msTimeDistance = inputDate.getTime() - yearStartTime.getTime();
        long msPerDay = 24 * 60 * 60 * 1000; // количество миллисекунд в сутках
        int dayCount = (int) (msTimeDistance / msPerDay); // количество дней с начала года
        return !(dayCount % 2 == 0); // true если нечётное число
    }
}
