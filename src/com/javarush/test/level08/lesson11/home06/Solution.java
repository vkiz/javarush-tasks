package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Child 1", true, 10, new ArrayList<Human>());
        Human child2 = new Human("Child 2", false, 8, new ArrayList<Human>());
        Human child3 = new Human("Child 3", true, 5, new ArrayList<Human>());

        ArrayList<Human> list1 = new ArrayList<Human>();
        Collections.addAll(list1, child1, child2, child3);

        Human father = new Human("Father", true, 35, list1);
        Human mother = new Human("Mother", false, 35, list1);

        ArrayList<Human> list2 = new ArrayList<Human>();
        list2.add(father);

        Human grandFather1 = new Human("Grandfather 1", true, 65, new ArrayList<Human>(list2));
        Human grandMother1 = new Human("Grandmother 1", false, 64, new ArrayList<Human>(list2));

        ArrayList<Human> list3 = new ArrayList<Human>();
        list3.add(mother);

        Human grandFather2 = new Human("Grandfather 2", true, 63, new ArrayList<Human>(list3));
        Human grandMother2 = new Human("Grandmother 2", false, 62, new ArrayList<Human>(list3));

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;
                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
