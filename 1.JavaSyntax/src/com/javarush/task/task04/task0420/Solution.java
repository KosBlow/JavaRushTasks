package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer arr[] = {a, b, c};

        Arrays.sort(arr, Collections.reverseOrder());
//Выводим отсортированный массив на консоль.
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
            //напишите тут ваш код
        }
    }
}
