package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

       String line;
       while ((line=fileReader.readLine())!= null){
           if(line.startsWith(args[0]+" ")){
           System.out.println(line);}
       }
       reader.close();
       fileReader.close();


    }
}
