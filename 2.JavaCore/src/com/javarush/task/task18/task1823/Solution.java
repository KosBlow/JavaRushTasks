package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
           String file = reader.readLine();
           if(file.equals("exit")){break;}
           new ReadThread(file).start();
        }
        reader.close();
        for (Map.Entry m : resultMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);// implement file reading here - реализуйте чтение из файла тут
                Map<Integer,Integer>map = new HashMap<>();
                int maxRepeat = 0;

                while (inputStream.available()>0){
                    int data = inputStream.read();
                    map.putIfAbsent(data,0);
                    map.put(data,map.get(data)+1);

                    if(map.get(data)>maxRepeat){
                        maxRepeat = map.get(data);
                    }
                }
                inputStream.close();
                synchronized (Solution.class){
                    for(Map.Entry<Integer,Integer> m: map.entrySet()){
                        if(m.getValue() == maxRepeat){
                            resultMap.put(fileName,m.getKey());
                        }
                    }
                }
            }catch (IOException e){
                System.out.println("File not found");
                e.printStackTrace();
            }
        }


    }
    }

