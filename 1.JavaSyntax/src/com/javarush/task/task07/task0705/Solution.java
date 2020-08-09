package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        int x = 10;

        for (int i = 0; i < big.length; i++) {//напишите тут ваш код
            big[i] = Integer.parseInt(reader.readLine());}


        for(int j = 0; j<10; j++){
            small1[j] = big[j];
          small2[j] = big[x];
          x++;
        }
            for(int i = 0; i<small2.length; i++)
            System.out.println(small2[i]);
        }
    }

