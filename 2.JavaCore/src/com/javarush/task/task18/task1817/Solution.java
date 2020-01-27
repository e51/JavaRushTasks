package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String filename = "/dev/temp/file.txt";
        String filename = args[0];
        // " " 32

        FileInputStream inputStream = new FileInputStream(filename);

        int countAll = 0;
        int countSpace = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();

            countAll++;

            if (data == 32) countSpace++;
        }

        inputStream.close();
        System.out.printf("%.2f", 100.0 * countSpace / countAll);

    }
}
