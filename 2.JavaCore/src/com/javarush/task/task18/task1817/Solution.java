package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        double countWhitespace = 0;
        double countLeters = 0;
        while (inputStream.available()>0){

            int data = inputStream.read();
            countLeters++;
            if(Character.isWhitespace(data)) {countWhitespace++; }
        }

        System.out.printf("%.2f%n",countWhitespace/countLeters*100);
        inputStream.close();


    }
}
