package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            FileInputStream fis = new FileInputStream(reader.readLine());
            BufferedReader r = new BufferedReader(new InputStreamReader(fis));
            while ((s = r.readLine()) != null) {
                int i = Integer.parseInt(s);
                if (i % 2 == 0) {
                    list.add(i);
                }

            } fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        reader.close();
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
        // напишите тут ваш код


