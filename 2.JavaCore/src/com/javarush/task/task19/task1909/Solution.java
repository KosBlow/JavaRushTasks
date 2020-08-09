package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReder = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        String line;
        while ((line=fileReder.readLine())!=null){
           String s = line.replaceAll("\\.","!");
            writer.write(s);
        }
        reader.close();
        fileReder.close();
        writer.close();
    }

}
