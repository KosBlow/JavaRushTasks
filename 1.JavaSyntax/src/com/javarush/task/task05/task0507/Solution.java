package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double summ = 0;
        int i = 0;
        while (true) {
            int number = sc.nextInt();
            i++;
            if(number == -1)
                break;
            summ += number;

            //напишите тут ваш ко
           }
        System.out.println(summ/i);

    }
}

