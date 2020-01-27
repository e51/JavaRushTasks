package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String filename1 = "/dev/temp/file.txt";
//        String filename2 = "/dev/temp/file2.txt";
//        String filename3 = "/dev/temp/file3.txt";
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename1);
        FileOutputStream outputStream2 = new FileOutputStream(filename2);
        FileOutputStream outputStream3 = new FileOutputStream(filename3);

        while (inputStream.available() > 0) {
            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);
            int part1 = buff.length / 2 + buff.length % 2;
            int part2 = buff.length - part1;

            outputStream2.write(buff, 0, part1);
            outputStream3.write(buff, part1, part2);

        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
