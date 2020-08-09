package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>0 && a<=9 && a%2 == 0)
            System.out.println("четное однозначное число");
        else if (a>0 && a<=9 && a%2 != 0)
            System.out.println("нечетное однозначное число");
        else if (a>9 && a<=99 && a%2 == 0)
            System.out.println("четное двузначное число");
        else if (a>9 && a<=99 && a%2 != 0)
            System.out.println("нечетное двузначное число");
        else if (a>99 && a<=999 && a%2 == 0)
            System.out.println("четное трехзначное число");
        else if (a>99 && a<=999 && a%2 != 0)
            System.out.println("нечетное трехзначное число");
        //напишите тут ваш код

    }
}
