package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String file = reader.readLine();
            if ("exit".equals(file)) break;

            new ReadThread(file).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            InputStream inputStream = null;
            int[] arr = new int[256];

            try {
                inputStream = new FileInputStream(fileName);

                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    arr[data] = arr[data] + 1;
                }

                int indexMaxValue = 0;
                int value = 0;
                for (int i = 1; i < arr.length; i++) {
                    if (value < arr[i]) {
                        indexMaxValue = i;
                        value = arr[i];
                    }
                }

                resultMap.put(fileName, new Integer(indexMaxValue));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
