package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1copy = new FileInputStream(filename1);
        FileInputStream fileInputStream2copy = new FileInputStream(filename2);

        byte[] file1copy = new byte[fileInputStream1copy.available()];
        byte[] file2copy = new byte[fileInputStream2copy.available()];

        fileInputStream1copy.read(file1copy);
        fileInputStream2copy.read(file2copy);

        fileInputStream1copy.close();
        fileInputStream2copy.close();


        FileOutputStream fileOutputStream = new FileOutputStream(filename1);
        fileOutputStream.write(file2copy);
        fileOutputStream.write(file1copy);
        fileOutputStream.close();

    }
}
