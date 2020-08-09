package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int[] list = new int[5];

    for (int i = 0; i < list.length; i++)
    {
      String s = reader.readLine();
      list[i] = Integer.parseInt(s);
    }
        Arrays.sort(list);
        for(int i = 0; i <  list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        //напишите тут ваш код
    }

}
