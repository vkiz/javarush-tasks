package com.javarush.test.level05.lesson12.home04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        String formattedDate = dateFormat.format(calendar.getTime());
        System.out.println(formattedDate);
    }
}
