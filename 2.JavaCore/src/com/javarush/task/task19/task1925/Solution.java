package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader br = new BufferedReader(new FileReader(file1));
        FileWriter fileWriter = new FileWriter(file2);

        boolean comma = false;
        while (br.ready()) {
            String str = br.readLine();
            String[] words = str.split(" ");

            for (String word : words) {
                if (word.length() > 6) {
                    if (comma) {
                        fileWriter.write(",");
                    }
                    fileWriter.write(word);
                    comma = true;
                }
            }
        }

        fileWriter.close();
        br.close();

    }
}
