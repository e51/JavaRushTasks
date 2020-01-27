package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
//            String filename = "/dev/temp/file.txt";
            String filename = reader.readLine();
            FileInputStream inputStream = new FileInputStream(filename);

            if (inputStream.available() < 1000) {
                reader.close();
                inputStream.close();

                throw new DownloadException();
            }
            inputStream.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
