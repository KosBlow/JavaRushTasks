package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

CrUD - Create, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        DateFormat smp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String name;
        Person person;
        Date date;
        int id;
       switch (args[0]){
           case "-c":
               name = args[1];
               date = smp.parse(args[3]);
               person = "м".equals(args[2])? Person.createMale(name, date): Person.createFemale(name, date) ;
               allPeople.add(person);
               System.out.println(allPeople.size()-1);
               break;
           case "-u":
               id = Integer.parseInt(args[1]);
               name = args[2];
               Sex sex = "м".equals(args[2])? Sex.MALE: Sex.FEMALE;
               date = smp.parse(args[4]);
               allPeople.get(id).setName(name);
               allPeople.get(id).setSex(sex);
               allPeople.get(id).setBirthDate(date);
               break;
           case "-d":
               id = Integer.parseInt(args[1]);
               allPeople.get(id).setName(null);
               allPeople.get(id).setSex(null);
               allPeople.get(id).setBirthDate(null);
               break;
           case "-i":
               id = Integer.parseInt(args[1]);
               person = allPeople.get(id);
               name = person.getName();
               DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
               String birthDate = format.format(person.getBirthDate());
               System.out.println(name+" "+(person.getSex() == Sex.MALE ? "м" : "ж")+" "+birthDate);
               break;
       }
       //start here - начни тут
    }
}
