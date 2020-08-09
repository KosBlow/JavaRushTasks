package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileread = new BufferedReader(new FileReader(reader.readLine()));
        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher;
        int count = 0;
        String line;
        while ((line = fileread.readLine())!= null){
            matcher = pattern.matcher(line);
            while (matcher.find()){count++;}
        }
        reader.close();
        fileread.close();
        System.out.println(count);
    }
}
