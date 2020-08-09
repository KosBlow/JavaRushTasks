package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available()>0){

            int data = inputStream.read(buffer);
        }
        inputStream.close();
        reader.close();

        for (int i = 0; i <buffer.length/2 ; i++) {
            byte tmp = buffer[i];
            buffer[i] = buffer[buffer.length-i-1];
            buffer[buffer.length-i-1] = tmp;
        }

        fileOutputStream1.write(buffer);
        fileOutputStream1.close();
    }


    }

