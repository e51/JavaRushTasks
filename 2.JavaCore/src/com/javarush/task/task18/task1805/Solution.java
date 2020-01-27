package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new HashSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String filename = "/dev/temp/file.txt";
        String filename = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename);

        while (inputStream.available() > 0) {
            Integer data = inputStream.read();

            set.add(data);
        }

        inputStream.close();

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        for (Integer item : list)
            System.out.print(item + " ");

    }
}
