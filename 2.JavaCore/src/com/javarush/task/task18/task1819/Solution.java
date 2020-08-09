package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        FileInputStream inputStream = new FileInputStream(file);
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());

        reader.close();

        byte[] buffer1 = new byte[inputStream.available()];
        inputStream.read(buffer1);
        inputStream.close();


        byte[] buffer2 = new byte[inputStream1.available()];
        inputStream1.read(buffer2);
        inputStream1.close();

        FileOutputStream outputStream = new FileOutputStream(file);

        outputStream.write(buffer2);
        outputStream.write(buffer1);

        outputStream.close();





    }
}
