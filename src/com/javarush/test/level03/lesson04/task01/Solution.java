package com.javarush.test.level03.lesson04.task01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/
public class Solution {
    public static void main(String[] args) {
        Calendar birthDay = new GregorianCalendar(1985, 7, 20);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(birthDay.getTime()).toUpperCase());
    }
}
