package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
      int[] first = {123,43,87,545,323};
      int[] second = {999,656};
      int[] third = {2,5,7,9};
      int[] four = {1,2,3,4,5,6,7};
      int[] five = new int[0];
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(four);
        list.add(five);
        return list;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
