package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Kotov" + i, "Ivan" + i);
        }

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String item : map.values()) {
            if (name.equals(item)) {
                count++;
            }
        }

        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

//        for (String item : map.keySet()) {
//            if (lastName.equals(item)) {
//                count++;
//            }
//        }

        if (map.containsKey(lastName))
            count++;

        return count;

    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "Ivan1"));
//        System.out.println(getCountTheSameLastName(map, "Kotov3"));

    }
}
