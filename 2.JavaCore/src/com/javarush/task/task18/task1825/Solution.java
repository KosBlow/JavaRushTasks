package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile(".+(part)(\\d+)");
        Matcher matcher;
        Map<Integer, String> map = new TreeMap<>();
        String line = null;
        String name = null;

        while (!(line = reader.readLine()).equals("end")) {
            name = line.substring(0, line.lastIndexOf("."));
            matcher = pattern.matcher(line);
             while (matcher.find()) {
                map.put(Integer.parseInt(matcher.group(2)),line);
            }
        }
        reader.close();


        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(name));
        for(Map.Entry<Integer,String> res: map.entrySet()) {
            FileInputStream inputStream = new FileInputStream(res.getValue());
            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);
            outputStream.write(buff);
            inputStream.close();
        }
        outputStream.close();

    }
}
