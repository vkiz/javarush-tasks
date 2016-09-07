package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg 1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg 2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg 3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg 4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Zerg 5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Zerg 6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Zerg 7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Zerg 8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Zerg 9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Zerg 10";

        Protos protos1 = new Protos();
        protos1.name = "Protos 1";
        Protos protos2 = new Protos();
        protos2.name = "Protos 2";
        Protos protos3 = new Protos();
        protos3.name = "Protos 3";
        Protos protos4 = new Protos();
        protos4.name = "Protos 4";
        Protos protos5 = new Protos();
        protos5.name = "Protos 5";

        Terran terran1 = new Terran();
        terran1.name = "Terran 1";
        Terran terran2 = new Terran();
        terran2.name = "Terran 2";
        Terran terran3 = new Terran();
        terran3.name = "Terran 3";
        Terran terran4 = new Terran();
        terran4.name = "Terran 4";
        Terran terran5 = new Terran();
        terran5.name = "Terran 5";
        Terran terran6 = new Terran();
        terran6.name = "Terran 6";
        Terran terran7 = new Terran();
        terran7.name = "Terran 7";
        Terran terran8 = new Terran();
        terran8.name = "Terran 8";
        Terran terran9 = new Terran();
        terran9.name = "Terran 9";
        Terran terran10 = new Terran();
        terran10.name = "Terran 10";
        Terran terran11 = new Terran();
        terran11.name = "Terran 11";
        Terran terran12 = new Terran();
        terran12.name = "Terran 12";
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
