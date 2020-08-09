package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url;
        ArrayList<String> list = new ArrayList<>();
        url = reader.readLine();
        String str = url.substring(url.indexOf("?")+1, url.lastIndexOf("="));
        String[] arrString = str.split("&");

        for (int i = 0; i < arrString.length ; i++) {
            if(arrString[i].contains("=")){
                list.add(arrString[i].substring(0, arrString[i].indexOf("=")));
            }
            else    list.add(arrString[i]);
        }
            for(String s : list){
                System.out.print(s+" ");
            }

            if(list.get(0).equals("obj")){
                String s = arrString[0].substring(arrString[0].indexOf("=")+1);
                try{
                    double d = Double.parseDouble(s);
                    System.out.println();
                    alert(d);
                }catch (Exception e){ alert(s);}

            }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
