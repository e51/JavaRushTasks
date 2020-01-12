package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() > 10) {
//                iterator.remove();
//            }
//        }
        Set<Integer> result = new HashSet<>();
        for (Integer item : set) {
            if (item <= 10) {
                result.add(item);
            }
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }


        return result;

    }

    public static void main(String[] args) {
//        Set<Integer> set = createSet();
//        set = removeAllNumbersGreaterThan10(set);

//        System.out.println(set);

    }
}
