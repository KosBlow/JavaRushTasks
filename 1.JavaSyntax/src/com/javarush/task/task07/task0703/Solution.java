package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        int[] sum = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
            sum[i] = list[i].length();}
            //напишите тут ваш код

            for (int j = 0; j < sum.length; j++) {

                System.out.println(sum[j]);
            }
        }

    }


