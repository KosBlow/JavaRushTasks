package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int maxRepeat = 0;


        while (inputStream.available()>0){
        int data = inputStream.read();
            map.putIfAbsent(data,0);
            map.put(data,map.get(data)+1);

            if (map.get(data) > maxRepeat) {
                maxRepeat = map.get(data);
            }
        }
        inputStream.close();
        reader.close();
        for (Map.Entry<Integer,Integer> s: map.entrySet()) {
            if(maxRepeat == s.getValue()){
                System.out.print(s.getKey()+" ");
            }
        }

        }

    }


