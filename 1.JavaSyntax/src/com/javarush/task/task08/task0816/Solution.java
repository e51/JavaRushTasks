package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("JUL 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("AUG 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("AUG 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("FEB 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("SEP 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("DEC 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("OCT 1 2012"));
        map.put("Сталлоне10", dateFormat.parse("JUN 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth();
            if (month > 4 && month < 8) {
                iterator.remove();
            }
//            System.out.println(iterator.next().getValue().getMonth());
        }

    }

    public static void main(String[] args) throws ParseException {
//        Map<String, Date> map = createMap();
//        System.out.println(map);
//        removeAllSummerPeople(map);
//        System.out.println(map);


    }
}
