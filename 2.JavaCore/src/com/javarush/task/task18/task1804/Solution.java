package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();


        while (inputStream.available()>0){
            int data = inputStream.read();
            map.putIfAbsent(data,0);
            map.put(data,map.get(data)+1);

        }
        inputStream.close();
        reader.close();
        for(Map.Entry<Integer,Integer> sort: map.entrySet()){
            set.add(sort.getValue());
        }
        int minReapet = ((TreeSet<Integer>) set).first();

        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(minReapet == m.getValue()){
                System.out.print(m.getKey()+" ");
            }
        }


    }
}
