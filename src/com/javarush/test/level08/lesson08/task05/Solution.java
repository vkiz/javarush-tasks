package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Страуструп", "Бьёрн");
        map.put("Гослинг", "Джеймс");
        map.put("Торвальдс", "Линус");
        map.put("Кнут", "Дональд");
        map.put("Айк", "Брендан");
        map.put("Гейтс", "Билл");
        map.put("Цукерберг", "Марк");
        map.put("Столлман", "Ричард");
        map.put("Кармак", "Джон");
        map.put("Клинтон", "Билл");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (Collections.frequency(copy.values(), pair.getValue()) > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}
