package com.javarush.task.task32.task3210;

import java.io.*;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String filename = args[0];
        long position = Long.valueOf(args[1]);
        String text = args[2];

        String textFromFile;
        byte[] buffer = new byte[text.length()];

        RandomAccessFile file = new RandomAccessFile(filename, "rw");

        file.seek(position);
        file.read(buffer, 0, buffer.length);
        textFromFile = new String(buffer);

        String result = "false";
        if (textFromFile.equals(text))
            result = "true";

        file.seek(file.length());
        file.write(result.getBytes());
        file.close();

    }
}
