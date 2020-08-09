package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        reader.close();
        BufferedReader fileReader = new BufferedReader(file);

        String line;
        while ((line = fileReader.readLine())!= null){
            int count = 0;
                String[] arr = line.split(" ");
                for(String a : words){
                    for(String b : arr){
                        if(b.equals(a)){
                            count++;
                        }
                    }
                }

            if(count == 2) {
                System.out.println(line);
            }
        }
            fileReader.close();
        file.close();

    }
}
