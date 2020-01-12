package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Kotov1", "Ivan1");
        map.put("Kotov2", "Ivan2");
        map.put("Kotov3", "Ivan3");
        map.put("Kotov4", "Ivan4");
        map.put("Kotov5", "Ivan2");
        map.put("Kotov6", "Ivan6");
        map.put("Kotov7", "Ivan7");
        map.put("Kotov8", "Ivan8");
        map.put("Kotov9", "Ivan9");
        map.put("Kotov10", "Ivan2");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);

//        for (String value : copy.values()) {
//            removeItemFromMapByValue(map, value);
//        }

        Iterator<String> iterator = copy.values().iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            iterator.remove();
            if (copy.values().contains(value)) {
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        System.out.println(map);
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);

    }
}
