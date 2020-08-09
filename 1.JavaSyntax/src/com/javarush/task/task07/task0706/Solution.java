package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int summodd = 0;
        int summEven = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
            summodd = i%2 == 0? summodd+arr[i]:summodd+0;
            summEven = i%2 != 0? summEven+arr[i]:summEven+0;//напишите тут ваш код
        }

        if(summodd>summEven)
            System.out.println( "В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
