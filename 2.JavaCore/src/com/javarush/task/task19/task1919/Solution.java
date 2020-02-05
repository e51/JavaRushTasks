package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String file = "/dev/temp/file.txt";
        String file = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<String, Double> map = new TreeMap<>();
        while (reader.ready()) {
            String[] arr = reader.readLine().split(" ");
            if (map.containsKey(arr[0])) {
                map.put(arr[0], map.get(arr[0]) + Double.valueOf(arr[1]));
            } else {
                map.put(arr[0], Double.valueOf(arr[1]));
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        reader.close();
    }
}
