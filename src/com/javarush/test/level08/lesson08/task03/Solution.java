package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Бьёрн"));
        System.out.println(getCountTheSameLastName(map, "Гослинг"));
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Страуструп", "Бьёрн");
        map.put("Гослинг", "Джеймс");
        map.put("Торвальдс", "Линус");
        map.put("Бернерс-Ли", "Тим");
        map.put("Кнут", "Дональд");
        map.put("Айк", "Брендан");
        map.put("Гейтс", "Билл");
        map.put("Цукерберг", "Марк");
        map.put("Столлман", "Ричард");
        map.put("Кармак", "Джон");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}
