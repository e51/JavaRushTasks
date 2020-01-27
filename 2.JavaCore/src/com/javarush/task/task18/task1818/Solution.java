package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        reader.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(filename1);
        FileInputStream fileInputStream2 = new FileInputStream(filename2);

        while (fileInputStream2.available() > 0) {
            int data = fileInputStream2.read();
            fileOutputStream1.write(data);
        }

        fileInputStream2.close();

        FileInputStream fileInputStream3 = new FileInputStream(filename3);

        while (fileInputStream3.available() > 0) {
            int data = fileInputStream3.read();
            fileOutputStream1.write(data);
        }

        fileInputStream3.close();
        fileOutputStream1.close();

    }
}
