package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

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

        double maxValue = Collections.max(map.values());

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() == maxValue)
                System.out.println(entry.getKey());
        }

        reader.close();
    }
}
