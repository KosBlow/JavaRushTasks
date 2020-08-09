package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>0){
           a=  a+a;
        }
            else if(a<0){
                a++;
        }
            else if (a == 0);
        System.out.println(a);
        //напишите тут ваш код

    }

}