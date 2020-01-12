package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());

        while (a > 0) {
            int result = (a % 10 % 2 == 0) ? even++ : odd++;
//            if (a % 10 % 2 == 0)
//                even++;
//            else
//                odd++;
            a /= 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
