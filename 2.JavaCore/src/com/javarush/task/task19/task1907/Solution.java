package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file = "/dev/temp/world.txt";
        String file = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(file);

        StringBuilder sb = new StringBuilder();
        while (fileReader.ready()) {
            sb.append((char) fileReader.read());
        }

        fileReader.close();

//        System.out.println(sb);

        int count = 0;
        for (String item : sb.toString().split("\\W")) {
//            System.out.println(item);
            if ("world".equals(item))
                count++;
        }

        System.out.println(count);

        // alternative solution:
        //List<String> list = Arrays.asList(sb.toString().split("\\W"));
        //System.out.println(Collections.frequency(list, "world"));

    }
}
