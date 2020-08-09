package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age % 4 != 0 || (age % 100 == 0 & age % 400 != 0))
            age = 365;
        else age = 366;
        System.out.println("количество дней в году: " + age);//напишите тут ваш код
    }
}