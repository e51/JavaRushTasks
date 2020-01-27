package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int secret = 15;

        if ("-e".equals(args[0]) || "-d".equals(args[0])) {
            // encoding and decoding is the same procedure - XOR

            String fileName = args[1];
            String fileOutputName = args[2];

            InputStream inputStream = new FileInputStream(fileName);
            OutputStream outputStream = new FileOutputStream(fileOutputName);

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data ^ secret);
            }

            inputStream.close();
            outputStream.close();
        }

    }

}
