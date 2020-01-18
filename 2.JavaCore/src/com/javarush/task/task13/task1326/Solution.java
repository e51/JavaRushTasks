package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file = "C:/dev/temp/numbers.txt";
        String file = reader.readLine();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        List<Integer> list = new ArrayList<>();

        while (bufferedReader.ready()) {
            int a = Integer.valueOf(bufferedReader.readLine());
            if (a % 2 == 0)
                list.add(a);
        }

        // sort
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // swap
                    int tmp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, tmp);
                }
            }
        }

        for (Integer item : list) {
            System.out.println(item);
        }

        bufferedReader.close();
        reader.close();
    }
}
