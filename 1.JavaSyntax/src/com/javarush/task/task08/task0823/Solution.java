package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        // не самое красивое решение, но лучше не придумал
        boolean doCapital = true;
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            String temp = "" + string.charAt(i);

            if (doCapital) {
                temp = temp.toUpperCase();
                doCapital = false;
            }

            if (" ".equals(temp)) {
                doCapital = true;
            }

            result = result + temp;
        }

        System.out.println(result);
    }
}
