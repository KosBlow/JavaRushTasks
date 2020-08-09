package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("Bob");
        map.put("Bob", cat1);
        Cat cat2 = new Cat("Bob2");
        map.put("Bob2", cat2);
        Cat cat3 = new Cat("Bob3");
        map.put("Bob3", cat3);
        Cat cat4= new Cat("Bob4");
        map.put("Bob4", cat4);
        Cat cat5 = new Cat("Bob5");
        map.put("Bob5", cat5);
        Cat cat6 = new Cat("Bob6");
        map.put("Bob6", cat6);
        Cat cat7 = new Cat("Bob7");
        map.put("Bob7", cat7);
        Cat cat8 = new Cat("Bob8");
        map.put("Bob8", cat8);
        Cat cat9 = new Cat("Bob9");
        map.put("Bob9", cat9);
        Cat cat = new Cat("Bobi");
        map.put("Bobi", cat);
        return map;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>(map.values());
        return set;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
