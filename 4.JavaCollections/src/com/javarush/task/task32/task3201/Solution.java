package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
//        String filename = "/dev/temp/file.txt";
//        long position = 100;
//        String text = "zzzzzzzzz";
        String filename = args[0];
        long position = Long.valueOf(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(filename, "w");

        if (raf.length() < position)
            position = raf.length();

        raf.seek(position);
        raf.write(text.getBytes());
        raf.close();
    }
}
