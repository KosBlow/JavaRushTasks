package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int c = number/100;
        int x = number%100/10;
        int j = number%c/10;
        return c+x+j;//напишите тут ваш код
    }
}