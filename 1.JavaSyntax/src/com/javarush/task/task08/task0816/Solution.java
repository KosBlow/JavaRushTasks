package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Besednikov", df.parse("MAY 19 1986"));
        map.put("Verby", df.parse("JULY 4 1986"));
        map.put("Ryblov", df.parse("JUNE 4 1986"));
        map.put("Stefanovich", df.parse("AUGUST 4 1986"));
        map.put("Rabushenko", df.parse("APRIL 4 1986"));
        map.put("Kolosov", df.parse("JUNE 19 1986"));
        map.put("Sheva", df.parse("AUGUST 4 1986"));
        map.put("Tymchenko", df.parse("JANUARY 4 1986"));
        map.put("Lutcay", df.parse("JUNE 4 1986"));


        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> copy = new HashMap<String, Date>(map);
       for(Map.Entry<String, Date> entry: copy.entrySet()){
           Date value = entry.getValue();
           int month = value.getMonth();
           if(month>4 && month<8){
               map.remove(entry.getKey());}
       }

    }

    public static void main(String[] args) {

    }
}
