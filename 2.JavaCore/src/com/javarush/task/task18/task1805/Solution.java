package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Set<Integer> set = new TreeSet<>();

        while (inputStream.available()>0){
            int data = inputStream.read();
            set.add(data);
        }
        inputStream.close();
        reader.close();
        for(Integer i : set){
            System.out.print(i+" ");
        }
    //    set.stream().forEach(x -> System.out.print(x + " "));
    }
}
