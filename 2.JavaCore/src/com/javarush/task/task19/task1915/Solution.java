package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(reader.readLine());


        out.write(outputStream.toByteArray());
        System.out.println(outputStream);
        out.close();
        reader.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

