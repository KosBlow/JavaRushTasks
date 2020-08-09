package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args)   {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File file = new File(reader.readLine());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String s;

            while (!(s = reader.readLine()).equals("exit")) {
                writer.write(s+"\r\n");
            }
            writer.write(s);



            reader.close();
            writer.close();

        } catch (Exception e) {
            System.out.println("blya");
        }

    }
}

