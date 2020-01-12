package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(reader.readLine());
        int maximum = 0;

        //напишите тут ваш код
        if (count > 0) {
            maximum = Integer.valueOf(reader.readLine());
            count--;
            for (int i = 0; i < count; i++) {
                int value = Integer.valueOf(reader.readLine());
                if (value > maximum)
                    maximum = value;
            }

            System.out.println(maximum);
        }
    }
}
