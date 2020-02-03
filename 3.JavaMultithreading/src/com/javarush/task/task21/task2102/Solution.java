package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
//        System.out.println(Integer.toBinaryString(((allModifiers) & 0xFF) + 0x100).substring(1));
//        System.out.println(Integer.toBinaryString(((specificModifier) & 0xFF) + 0x100).substring(1));
//        System.out.println(Integer.toBinaryString(((allModifiers & specificModifier) & 0xFF) + 0x100).substring(1));

        return (allModifiers & specificModifier) == specificModifier;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
