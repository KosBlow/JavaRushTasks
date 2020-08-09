package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        DateFormat smp = new SimpleDateFormat("dd/MM/yyyy");//start here - начни тут
        String name;
        Person person;
        Date date;
        int id;

        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    for (int i = 1; i <args.length ; i = i+3) {
                        name = args[i];
                        String sex = args[i+1];
                        date = smp.parse(args[i+2]);
                        person = "м".equals(sex)? Person.createMale(name, date): Person.createFemale(name, date) ;
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }

                } break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i++]);
                        name = args[i];
                        Sex sex = "м".equals(args[++i]) ? Sex.MALE : Sex.FEMALE;
                        date = smp.parse(args[++i]);
                        allPeople.get(id).setName(name);
                        allPeople.get(id).setSex(sex);
                        allPeople.get(id).setBirthDate(date);
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        person = allPeople.get(id);
                        name = person.getName();
                        DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String birthDate = format.format(person.getBirthDate());
                        System.out.println(name + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + birthDate);
                    }
                }
                break;
        }

    }
}
