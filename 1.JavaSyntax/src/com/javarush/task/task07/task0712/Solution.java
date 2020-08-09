package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {//напишите тут ваш код
            list.add(reader.readLine());
        }
            int min = list.get(0).length();
            int max = list.get(0).length();

        for(int i = 0; i<10; i++) {//напишите тут ваш код

            if(list.get(i).length()<min) min = list.get(i).length();
            if(list.get(i).length()>min) max = list.get(i).length();
        }
        for(int i = 0; i<10; i++){
            if(min == list.get(i).length() || max == list.get(i).length()){
                System.out.println(list.get(i)); break;}


            }
            }

    }

