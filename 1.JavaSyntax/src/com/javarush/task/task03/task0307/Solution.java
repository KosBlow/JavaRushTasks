package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
       Zerg a = new Zerg();
       a.name = "z1";
        Zerg b = new Zerg();
        b.name = "z2";
        Zerg c = new Zerg();
        c.name = "z3";
        Zerg d = new Zerg();
        d.name = "z4";
        Zerg v = new Zerg();
        v.name = "z5";

        Protoss pa = new Protoss();
        pa.name = "p1";
        Protoss va = new Protoss();
        va.name = "p2";
        Protoss ba = new Protoss();
        ba.name = "p3";

        Terran ta = new Terran();
        ta.name = "t1";
        Terran tb = new Terran();
        tb.name = "t2";
        Terran td = new Terran();
        td.name = "t3";
        Terran tq = new Terran();
        tq.name = "t4";

        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
