package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private String proffesion;
        private String address;
        private int powwer;

            public Human(String name, int age){
                this.name = name;
                this.age = age;
            }
            public Human(String name, String lastName){
                this.name = name;
                this.lastName = lastName;
            }
            public Human(String proffesion, Human human,int age, String address ){
                this.proffesion = proffesion;
                this.age = age;
                this.address = address;
            }
            public Human(String name, String address, String proffesion){
                this.name = name;
                this.address = address;
                this.proffesion = proffesion;
            }
            public Human(String name, String lastName, int age, String proffesion, String address){
                this.name = name;
                this.lastName = lastName;
                this.age = age;
                this.proffesion = proffesion;
                this.address = address;
            }
            public Human(){}

             public Human(String name, String lastName, int age, String proffesion, String address, int powwer){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.proffesion = proffesion;
            this.address = address;
            this.powwer = powwer;
        }
        public Human( String lastName, int age, String proffesion, String address){
            this.lastName = lastName;
            this.age = age;
            this.proffesion = proffesion;
            this.address = address;
        }
        public Human (int age, String proffesion, String address){
            this.age = age;
            this.proffesion = proffesion;
            this.address = address;
        }
        public Human(String name, int powwer, String address){
            this.name = name;
            this.powwer = powwer;
            this.address = address;
        }// Напишите тут ваши переменные и конструкторы
    }
}
