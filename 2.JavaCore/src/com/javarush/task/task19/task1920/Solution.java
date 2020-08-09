package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();
        double max = 0.0;

        String line;
        while ((line = file.readLine())!=null){
            String[]s = line.split(" ");
            map.putIfAbsent(s[0],0.0);
            map.put(s[0],map.get(s[0])+Double.parseDouble(s[1]));
        }

        file.close();
        for(Map.Entry<String,Double> m : map.entrySet()){
            if(m.getValue()>max){max = m.getValue();}
        }

        for(Map.Entry<String,Double> m : map.entrySet()){
            if(m.getValue()==max){
                System.out.println(m.getKey());}
        }
        }
    }

