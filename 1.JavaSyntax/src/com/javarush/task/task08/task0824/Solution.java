package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<Human>();
       Human kid1 = new Human("Liza", false, 7);
       Human kid2 = new Human("Jenya", true,9);
       Human kid3 = new Human("Sasha", true,15);
        children.add(kid1);
        children.add(kid2);
        children.add(kid3);
        ArrayList<Human> parent1 = new ArrayList<>();
        ArrayList<Human> parent2 = new ArrayList<>();
        Human dad = new Human("Kostya", true, 32, children);
        Human mom = new Human("Liliia", false, 33, children);
        parent1.add(dad);
        parent2.add(mom);
       Human grandfather1 = new Human("Petro", true,60, parent2);
       Human granfather2 = new Human("Vssyl", true, 62, parent1);
       Human grandmom1 = new Human("Valya", false, 55, parent2);
       Human grandmom2 = new Human("Lyda", false, 63, parent1);




        System.out.println(grandfather1.toString());
        System.out.println(granfather2.toString());
        System.out.println(grandmom1.toString());
        System.out.println(grandmom2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        for(Human s : children){
            System.out.println(s);
        }
       // System.out.println(children);//напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }//напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
