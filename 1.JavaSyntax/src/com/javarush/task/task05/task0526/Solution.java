package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
       Man man = new Man("Bob", 22, "svobody street");
       Woman woman = new Woman("Marta", 21, "Krasopolska street");
       Man man2 = new Man("Kostya", 32, "Svobody 32");
       Woman woman2 = new Woman("Lilia", 33, "Svobody 32");
        //напишите тут ваш код
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println( name + " " + age + " " + address);
        }

    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println( name + " " + age + " " + address);
        }
    }//напишите тут ваш код
}
