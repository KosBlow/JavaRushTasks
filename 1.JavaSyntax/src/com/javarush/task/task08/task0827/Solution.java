package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));

          }

   public static boolean isDateOdd(String date) {
        Date d = new Date(date);
       DateFormat df = new SimpleDateFormat("D");
       int x = Integer.parseInt(df.format(d));
       boolean c =  x%2 != 0? true : false;

        return c ;
    }
}
