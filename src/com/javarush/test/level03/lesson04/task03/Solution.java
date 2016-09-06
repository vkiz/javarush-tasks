package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg = null;
        for (int i = 1; i <= 10; i++) {
            zerg = new Zerg();
            zerg.name = "Zerg_" + i;
        }

        Protos protos = null;
        for (int i = 1; i <= 5; i++) {
            protos = new Protos();
            protos.name = "Protos_" + i;
        }

        Terran terran = null;
        for (int i = 1; i <= 12; i++) {
            terran = new Terran();
            terran.name = "Terran_" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protos {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
