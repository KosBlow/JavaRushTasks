package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true) {
            key = reader.readLine();
            if ("user".equals(key) || "loser".equals(key) ||"coder".equals(key) ||"proger".equals(key)) {
                //тут цикл по чтению ключей, пункт 1


                switch (key) {
                    case "user":
                        person = new Person.User();
                        //создаем объект, пункт 2
                        break;
                    case "loser":
                        person = new Person.Loser();

                        break;
                    case "coder":
                        person = new Person.Coder();
                        break;
                    case "proger":
                        person = new Person.Proger();
                        break;
                }



                doWork(person);}
        else {
            break;
            }
        }
    }
                //вызываем doWork





        public static void doWork (Person person){
            if (person instanceof Person.User) {
                ((Person.User) person).live();// пункт 3
            } else if (person instanceof Person.Proger) {
                ((Person.Proger) person).enjoy();
            } else if (person instanceof Person.Loser) {
                ((Person.Loser) person).doNothing();
            } else if (person instanceof Person.Coder) {
                ((Person.Coder) person).writeCode();
            }
        }
    }





