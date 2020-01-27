package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String filename = "/dev/temp/file.txt";
        String filename = args[0];
        // A-Z 62-90
        // a-z 97-122

        FileInputStream inputStream = new FileInputStream(filename);

        int count = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();

            if (data >= 62 && data <= 90 || data >= 97 && data <= 122)
                count++;
        }

        inputStream.close();
        System.out.println(count);

    }
}
