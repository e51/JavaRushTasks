package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String filename1 = "/dev/temp/file.txt";
//        String filename2 = "/dev/temp/file2.txt";
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename1);
        FileOutputStream outputStream = new FileOutputStream(filename2);

        while (inputStream.available() > 0) {
            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);

            // reverse :( - the only way I can do
            for (int i = 0; i < buff.length / 2; i++) {
                byte tmp = buff[i];
                buff[i] = buff[buff.length - 1 - i];
                buff[buff.length - 1 - i] = tmp;
            }

            outputStream.write(buff);
        }

        inputStream.close();
        outputStream.close();
    }
}
