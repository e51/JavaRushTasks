package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandpa1 = new Human("GrandPa1", true, 70);
        Human grandpa2 = new Human("GrandPa2", true, 75);
        Human granny1 = new Human("Granny1", false, 68);
        Human granny2 = new Human("Granny2", false, 69);
        Human father1 = new Human("Father1", true, 40, grandpa1, granny1);
        Human mother1 = new Human("Mother1", false, 35, grandpa2, granny2);
        Human child1 = new Human("Child1", true, 7, father1, mother1);
        Human child2 = new Human("Child2", true, 5, father1, mother1);
        Human child3 = new Human("Child3", false, 6, father1, mother1);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(granny1);
        System.out.println(granny2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}