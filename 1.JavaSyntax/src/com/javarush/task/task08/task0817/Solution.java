package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("Besednikov","Kostya");
        map.put("Ryabushenko","Nataly");
        map.put("Besednik","Mark");
        map.put("Elize","Boby");
        map.put("Market","Boby");
        map.put("Stefanovich","Ilona");
        map.put("Besednikova","Liliia");
        map.put("Dubinin","Jenya");
        map.put("Odynec","Katya");
        map.put("Petrovskaya","Katya");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList list = new ArrayList<>(map.values());
        Collections.sort(list);
       for(int i =0; i<list.size()-1; i++){
           if(list.get(i).equals(list.get(i+1))){
               removeItemFromMapByValue(map, list.get(i).toString());//напишите тут ваш код
           }
       }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
