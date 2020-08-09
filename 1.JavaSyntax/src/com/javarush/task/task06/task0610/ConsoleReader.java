package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;//напишите тут ваш код

    }

    public static int readInt() throws Exception {
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
        int i = sc.nextInt();
        return i;
    }

    public static double readDouble() throws Exception {
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
        double d = sc.nextDouble();
        return d;

    }

    public static boolean readBoolean() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        return b;//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
