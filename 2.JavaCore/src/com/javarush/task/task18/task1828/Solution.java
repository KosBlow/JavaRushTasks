package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        if (args.length == 0) return;

        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        Pattern pattern = Pattern.compile("(\\d+)(.+)");
        Matcher matcher;
        BufferedWriter writer;
        Map<String, String> map = new LinkedHashMap<>();
        String line;
        switch (args[0]) {
            case "-u": {
                while ((line = fileReader.readLine()) != null) {
                    matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        if(matcher.group(1).equals(args[1])){
                            map.put(args[1], String.format("%-8s%-30.30s%-8s%-4s", args[1], args[2], args[3], args[4]));}
                           else  map.put(matcher.group(1), line);
                    }
                }
                fileReader.close();
                writer = new BufferedWriter(new FileWriter(file));
                for (Map.Entry<String, String> m : map.entrySet()) {

                    writer.write(m.getValue());
                    writer.newLine();
                }
                writer.close();
                break;
            }
            case "-d":{
                while ((line = fileReader.readLine()) != null) {
                    matcher = pattern.matcher(line);
                    while (matcher.find()) {
                        if(!matcher.group(1).equals(args[1])){
                            map.put(matcher.group(1), line); }
                    }
                }
                fileReader.close();
                writer = new BufferedWriter(new FileWriter(file));
                for (Map.Entry<String, String> m : map.entrySet()) {

                    writer.write(m.getValue());
                    writer.newLine();
                }
                writer.close();
                break;
            }
        }
    }
}