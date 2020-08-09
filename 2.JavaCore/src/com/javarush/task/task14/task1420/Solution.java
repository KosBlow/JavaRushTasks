package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean is = true;
            int x = Integer.parseInt(reader.readLine());
        if(x <= 0) throw new Exception();
            int y = Integer.parseInt(reader.readLine());
        if(y<= 0) throw new Exception();

            int d = Math.max(x,y);
            int c = Math.min(x,y);
        while (is){
            int delitel = d%c;
            d = c;
            c = delitel;
            if(delitel == 0) is = false;
        }
        System.out.println(d);
        }
    }

