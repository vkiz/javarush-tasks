package com.javarush.test.level08.lesson03.task01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        // с помощью итератора
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        /* или с помощью оператора for each
        for (String s : set) {
            System.out.println(s);
        }
        */
    }
}
