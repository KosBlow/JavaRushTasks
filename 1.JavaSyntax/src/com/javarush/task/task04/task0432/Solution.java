package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int x = Integer.parseInt(reader.readLine());

        while (x>0){
            System.out.println(a);
            x--;//напишите тут ваш код
        }

    }
}
