package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();

        for (String item : strings) {
            if (item.contains("р")) {
                if (item.contains("л")) {
                    // do nothing
//                    result.add(item);
                } else {
                    // remove
                    continue;
                }
            } else if (item.contains("л")) {
                // double
//                result.add(item);
                result.add(item);
            }
            result.add(item);
        }

        return result;
    }
}