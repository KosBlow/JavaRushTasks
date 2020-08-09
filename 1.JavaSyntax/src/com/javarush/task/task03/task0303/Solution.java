package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd(180, 1.15));
        System.out.println(convertEurToUsd(350, 1.15));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        return  eur*course;//напишите тут ваш код
    }
}
