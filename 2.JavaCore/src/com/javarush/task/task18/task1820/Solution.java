package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedInputStream input = new BufferedInputStream (new FileInputStream(reader.readLine()));

        byte[] buff = new byte[input.available()];
        input.read(buff);
        input.close();

        String[] s = new String(buff).split(" ");
        StringBuilder sb = new StringBuilder();

        FileOutputStream output = new FileOutputStream(reader.readLine());
        for(String res : s){
            sb.append(Math.round(Double.parseDouble(res)))
                    .append(" ");
        }
        output.write(sb.toString().getBytes());
        output.close();
        reader.close();

    }
}
