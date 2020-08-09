package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char [] reselt = x.toCharArray();
       String vovels = "";
       String noVovels = "";
       for(int i = 0; i<reselt.length; i++){
          if(isVowel(reselt[i])){
              vovels += reselt[i] + " ";
          }
          else if (reselt[i] == ' '){
          continue;}
          else noVovels += reselt[i]+" ";

       }
        System.out.println(vovels);
        System.out.println(noVovels);
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}