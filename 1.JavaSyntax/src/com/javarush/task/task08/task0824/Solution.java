package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandpa1 = new Human("grandpa1", true, 90, new ArrayList<>());
        Human grandpa2 = new Human("grandpa2", true, 91, new ArrayList<>());
        Human granny1 = new Human("granny1", false, 80, new ArrayList<>());
        Human granny2 = new Human("granny2", false, 78, new ArrayList<>());

        Human father1 = new Human("father1", true, 45, new ArrayList<>());
        Human mother1 = new Human("mother1", false, 33, new ArrayList<>());

        Human child1 = new Human("child1", true, 7, new ArrayList<>());
        Human child2 = new Human("child2", true, 8, new ArrayList<>());
        Human child3 = new Human("child3", false, 5, new ArrayList<>());

        father1.children.add(child1);
        father1.children.add(child2);
        father1.children.add(child3);

        mother1.children.add(child1);
        mother1.children.add(child2);
        mother1.children.add(child3);

        grandpa1.children.add(father1);
        granny1.children.add(father1);

        grandpa2.children.add(mother1);
        granny2.children.add(mother1);

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
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
