package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        String s = rd.readLine();
        InputStream inStream = new FileInputStream(s);
        while (inStream.available() > 0) {
           System.out.write(inStream.read());// напишите тут ваш код}
        }
        System.out.println();
        inStream.close();
        rd.close();
    }
}