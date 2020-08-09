package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
       private Scanner fileScanner;
       public PersonScannerAdapter(Scanner fileScanner){ this.fileScanner = fileScanner;}

        @Override
        public Person read() throws IOException {
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            String line = fileScanner.nextLine();
            String lastName = line.split(" ")[0];
            String firstName = line.split(" ")[1];
            String middleName = line.split(" ")[2];
            Date birthDay = null;
            try {
                birthDay = sdf.parse(line.split(" ")[3] + line.split(" ")[4] + line.split(" ")[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(firstName, middleName, lastName, birthDay);
        }


        @Override
        public void close() throws IOException {
                fileScanner.close();
        }
    }

}
