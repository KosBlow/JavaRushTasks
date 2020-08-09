package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b & a !=c)
            System.out.println(a + " " + b);
        else if (a == c & c != b)
        System.out.println(a + " " + c);
        else if (a == b & a == c)
            System.out.println(a + " "+ b +" "+c);
        else if (c == b & b!=a)
            System.out.println(b+" "+c);
            //напишите тут ваш код
    }
}