package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int pol = 0;
        int otr = 0;
         if (a<0) otr++;
         else if (a>0) pol++;
         if (b<0) otr++;
         else if (b>0) pol++;
        if (c<0) otr++;
        else if (c>0) pol++;
        System.out.println("количество отрицательных чисел: "+ otr );
        System.out.println("количество положительных чисел: " + pol);

        //напишите тут ваш код

    }
}
