package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String file = "/dev/temp/crud.txt";
            String file = reader.readLine();
            reader.close();

//            String id = "198478";
            String id = args[0];

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            String line = "";
            while (br.ready()) {
                line = br.readLine();
                if (line.startsWith(id + " "))
                    System.out.println(line);
            }

            br.close();
        }
    }
}
