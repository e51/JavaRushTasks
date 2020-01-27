package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = "/dev/temp/file1.txt";
//        String file2 = "/dev/temp/file2.txt";
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

//        inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));

        String result = "";
        while (reader1.ready()) {
            String[] str = reader1.readLine().split(" ");
            for (int i = 0; i < str.length; i++) {
//                result = String.format(result + "%.0f ", Double.valueOf(str[i]));
//                result = String.format(result + "%d ", Math.round(Double.valueOf(str[i])));
                result = result + Math.round(Double.valueOf(str[i])) + " ";
            }
        }

        reader1.close();

//        System.out.println(result);

        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(result.getBytes());
        fileOutputStream.close();

    }
}
