package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();
//        Pattern pattern = Pattern.compile("(\\w+)\\s(.+)");

        String line;
        while ((line = file.readLine())!=null){
            String[]s = line.split(" ");
            map.putIfAbsent(s[0],0.0);
            map.put(s[0],map.get(s[0])+Double.parseDouble(s[1]));}

        file.close();

        for(Map.Entry<String,Double> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
