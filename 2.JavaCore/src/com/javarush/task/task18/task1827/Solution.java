package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        if (args[0].equals("-c")) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        Pattern pattern = Pattern.compile("(\\d+)(.+)");
        Matcher matcher;
        int max = 0;
        String line;

       while ((line=fileReader.readLine())!=null){
           matcher = pattern.matcher(line);
            while (matcher.find()){
                if(max<Integer.parseInt(matcher.group(1))){
                max = Integer.parseInt(matcher.group(1));}
            }
       }
       reader.close();
       fileReader.close();


                BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
                writer.newLine();
                writer.write(String.format("%-8d%-30.30s%-8s%-4s%n", ++max, args[1], args[2], args[3]));
                writer.close();
            }
    }
}
//    "%-8d%-30.30s%-8s%-4s%n"