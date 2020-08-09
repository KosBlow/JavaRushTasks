package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String a = reader.readLine();

        if (s.equals(a))
            System.out.println("Имена идентичны");
        else if (s.length() == a.length())
            System.out.println( "Длины имен равны");//напишите тут ваш код
    }
}
