package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file = "C:/dev/temp/out.txt";
        String file = reader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        String str = "";
        while (!"exit".equals(str)) {
            str = reader.readLine();
            bufferedWriter.write(str + "\n");
        }

        bufferedWriter.close();
        reader.close();

    }
}
