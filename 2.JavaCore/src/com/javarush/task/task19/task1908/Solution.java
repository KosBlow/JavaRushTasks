package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReder = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        Pattern pattern = Pattern.compile("(?<!\\S)\\d+(?!\\S)");
        Matcher matcher;
        String line;
        while ((line=fileReder.readLine())!=null){
            matcher =pattern.matcher(line);
            while (matcher.find()){
                writer.write(matcher.group()+" ");
            }
        }
        reader.close();
        fileReder.close();
        writer.close();

    }
}
