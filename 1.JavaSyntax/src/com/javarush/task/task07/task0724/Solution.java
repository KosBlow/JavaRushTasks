package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human("Ann",false, 44);
        Human human1 = new Human("Bob",true, 44);
        Human human2 = new Human("Matyn",true, 54);
        Human human3 = new Human("Mary",false, 55);
        Human human4 = new Human("Junior",true,25,human1,human);
        Human human5 = new Human("Mryloo",false,25,human1,human);
        Human human6 = new Human("Junior",true,25,human1,human);
        Human human7 = new Human("Junior",true,25,human1,human);
        Human human8 = new Human("Junior",true,25,human1,human);

        // напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

            public Human(String name, boolean sex, int age){
                this.name = name;
                this.sex = sex;
                this.age = age;
                System.out.println(toString());
            }
        public Human(String name, boolean sex, int age,Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            System.out.println(toString());
        }// напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}