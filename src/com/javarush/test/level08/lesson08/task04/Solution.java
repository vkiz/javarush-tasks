package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Страуструп", new Date("December 30 1950"));
        map.put("Гослинг", new Date("May 19 1955"));
        map.put("Торвальдс", new Date("December 28 1969"));
        map.put("Бернерс-Ли", new Date("June 08 1955"));
        map.put("Кнут", new Date("January 10 1938"));
        map.put("Айк", new Date("July 04 1961"));
        map.put("Гейтс", new Date("October 28 1955"));
        map.put("Цукерберг", new Date("May 14 1984"));
        map.put("Столлман", new Date("March 16 1953"));
        map.put("Кармак", new Date("August 20 1970"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth();
            if (month >= 5 && month <= 7) {
                iterator.remove();
            }
        }
    }
}
