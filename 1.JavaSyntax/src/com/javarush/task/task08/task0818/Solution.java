package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Besednikov", 1500);
        map.put("Besed", 450);
        map.put("Besednik", 500);
        map.put("Ryabkov", 350);
        map.put("Besednikova", 2500);
        map.put("Dubina", 1500);
        map.put("Shtefan", 1500);
        map.put("Volkov", 1500);
        map.put("Zayac", 255);
        map.put("Odynec", 1500);
        return map;//напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> pair = itr.next();
            Integer m = pair.getValue();
            if(m<500)
                itr.remove();//напишите тут ваш код
        }
    }

    public static void main(String[] args) {

    }
}