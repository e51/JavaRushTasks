package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int thisCatScore = 0;
        int anotherCatScore = 0;

        if (this.age > anotherCat.age)
            thisCatScore++;
        else if (this.age < anotherCat.age)
            anotherCatScore++;

        if (this.weight > anotherCat.weight)
            thisCatScore++;
        else if (this.weight < anotherCat.weight)
            anotherCatScore++;

        if (this.strength > anotherCat.strength)
            thisCatScore++;
        else if (this.strength < anotherCat.strength)
            anotherCatScore++;

        return thisCatScore > anotherCatScore;
    }

    public static void main(String[] args) {

    }
}
