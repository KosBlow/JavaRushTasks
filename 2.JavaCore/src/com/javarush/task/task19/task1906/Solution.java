package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader read = new FileReader(reader.readLine());
        FileWriter writer = new FileWriter(reader.readLine());

        while (read.ready()){
           read.read();
                writer.write(read.read());
            }


        reader.close();
        read.close();
        writer.close();
    }
}
