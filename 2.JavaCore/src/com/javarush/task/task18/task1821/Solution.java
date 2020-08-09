package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        Map<Character,Integer> map = new TreeMap<>();

        while (inputStream.available()>0){
            int data = inputStream.read();
            char c = (char) data;
                map.putIfAbsent(c, 0);
                map.put(c, map.get(c) + 1);
        }
        inputStream.close();
        for (Map.Entry<Character,Integer> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
