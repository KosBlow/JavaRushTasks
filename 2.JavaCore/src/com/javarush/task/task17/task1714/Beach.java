package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public  class Beach implements Comparable<Beach> {
    @Override
    public synchronized int compareTo(Beach o) {
        int first = this.quality>o.quality? 1 : (this.quality == o.quality? 0 : -1);
        int second = this.distance<o.distance? -1: ( this.distance == o.distance? 0: 1);
        return  first >second? 1: (first == second? 0: -1);
    }

    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public  Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public  static void main(String[] args) {

    }
}
