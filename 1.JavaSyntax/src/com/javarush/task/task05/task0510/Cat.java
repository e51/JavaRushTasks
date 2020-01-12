package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.weight = 10;
        this.age = 10;
        this.address = null;
        this.color = "green";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "green";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 10;
        this.age = age;
        this.address = null;
        this.color = null;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 10;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = address;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
