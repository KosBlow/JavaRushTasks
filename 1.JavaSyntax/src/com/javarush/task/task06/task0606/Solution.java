package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a>0){
            int i = a%2 ==0? even++: odd++;
            a = a/10;//напишите тут ваш код
        }
        System.out.println("Even: "+even+ " Odd: "+odd );
    }
}
