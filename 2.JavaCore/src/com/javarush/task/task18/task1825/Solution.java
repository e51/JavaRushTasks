package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String name = reader.readLine();
            if ("end".equals(name)) break;
            list.add(name);
        }

        reader.close();

        if (list.size() > 0) {
            String name = list.get(0).substring(0, list.get(0).lastIndexOf("."));
//            System.out.println(name);

            FileOutputStream outputStream = new FileOutputStream(name, true);

            for (int i = 1; i <= list.size(); i++) {
                String filename = name + ".part" + i;
                FileInputStream inputStream = new FileInputStream(filename);
                byte[] buffer = new byte[inputStream.available()];
                inputStream.read(buffer);
                inputStream.close();
                outputStream.write(buffer);
            }

            outputStream.close();
        }
    }
}
