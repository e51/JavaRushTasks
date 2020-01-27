package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String filename = "/dev/temp/file.txt";
        String filename = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename);

        while (inputStream.available() > 0) {
            Integer data = inputStream.read();

            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }

        inputStream.close();

        int maxValue = Collections.max(map.values());

        String result = "";
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //System.out.println(entry.getKey() + " - " + entry.getValue());
            if (entry.getValue() == maxValue) result = result + entry.getKey() + " ";
        }

        System.out.println(result);
    }
}
