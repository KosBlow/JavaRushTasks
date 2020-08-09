package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> even1 = new ArrayList<Integer>();
        ArrayList<Integer> even2 = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i = 0; i<20; i++){
            list.add(Integer.parseInt(reader.readLine()));
            Integer x = list.get(i);
            if(x%3 == 0 && x%2 == 0){ even1.add(x); even2.add(x);}
            else if (x%3 == 0){ even1.add(x);}
            else if (x%2 == 0) { even2.add(x);}
            else odd.add(x);
           //напишите тут ваш код
        }

        printList(even1);
        printList(even2);
        printList(odd);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
       //напишите тут ваш код

    }
}
