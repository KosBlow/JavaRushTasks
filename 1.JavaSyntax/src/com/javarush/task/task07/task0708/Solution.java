package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       strings = new ArrayList<>();
       int n = 0;
       for(int i = 0; i<5; i++){
           strings.add(reader.readLine());
          int m = strings.get(i).length();
          if(m>n) n = m;
          else n = n ;
              //напишите тут ваш код
       }
        for(int i = 0; i<strings.size(); i++){
            if(n == strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }

    }
}
