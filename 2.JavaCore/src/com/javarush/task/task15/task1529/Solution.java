package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
           String key = reader.readLine();
           if(key.equals("helicopter")){
               result = new Helicopter();
           }
           else if(key.equals("plane")){
               int pas = Integer.parseInt(reader.readLine());
               result = new Plane(pas);
           }
            reader.close();
        }catch (IOException e){ e.printStackTrace();}

    }
}
