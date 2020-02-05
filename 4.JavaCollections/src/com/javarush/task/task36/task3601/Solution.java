package com.javarush.task.task36.task3601;

import java.util.ArrayList;
import java.util.List;

/* 
MVC - простая версия
*/
public class Solution {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Model model = new Model();
        View view = new View();

        view.fireShowDataEvent();
//        new Solution().fireShowDataEvent();
    }


}
