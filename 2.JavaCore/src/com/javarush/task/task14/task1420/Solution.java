package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());

        if (a <= 0 || b <= 0) throw new Exception();

        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }

        System.out.println(a);

    }
}
