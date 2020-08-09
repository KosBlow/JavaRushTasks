package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine(),true);
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];
        byte[] buffer2 = new byte[inputStream1.available()];

       while (inputStream.available()>0){
            int data = inputStream.read(buffer);
       }
       inputStream.close();
        while (inputStream1.available()>0){
            int data = inputStream1.read(buffer2);
        }
        inputStream1.close();
        reader.close();
        outputStream.write(buffer);
        outputStream.write(buffer2);
        outputStream.close();
    }
}
//E:\Учеба\java.txt
//        E:\Учеба\java1.txt
//        E:\Учеба\jv.txt