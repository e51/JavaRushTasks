package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 10, j = 10;

        while (i > 0) {
            j = 10;
            while (j > 0) {
                System.out.print("S");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
