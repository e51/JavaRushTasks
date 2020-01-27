package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int height;
        private int weight;
        private String color;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String name, int age, boolean sex, int height, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int height, int weight, String color) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.color = color;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(boolean sex, int height, int weight) {
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(boolean sex, int height, int weight, String color) {
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.color = color;
        }

        public Human(int age, boolean sex, int height, int weight, String color) {
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.color = color;
        }
    }
}
