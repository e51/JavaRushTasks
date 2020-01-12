package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        //List<Integer> list = new ArrayList<>((Arrays.asList(1,1,1,4,4,4,4,4,4,4)));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }

        int count = 1;
        int maxCount = 0;
        int lastValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == lastValue) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 1;
                lastValue = list.get(i);
            }
        }

        if (maxCount < count) {
            maxCount = count;
        }

        System.out.println(maxCount);

    }
}