package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int max = 0;
        int min = list.get(0).length();
        int maxPosition = 0;
        int minPosition = 0;

        for (int i = 0; i < 10; i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                maxPosition = i;
            }
            if (min > list.get(i).length()) {
                min = list.get(i).length();
                minPosition = i;
            }
        }

        if (minPosition < maxPosition)
            System.out.println(list.get(minPosition));
        else
            System.out.println(list.get(maxPosition));

    }
}
