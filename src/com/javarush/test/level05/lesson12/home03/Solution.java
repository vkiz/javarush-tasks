package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse tuffyMouse = new Mouse("Tuffy", 8, 3);
        Cat tomCat = new Cat("Tom", 30, 15);
        Cat butchCat = new Cat("Butch", 50, 25);
        Dog spikeDog = new Dog("Spike", 50, 10);
        Dog tykeDog = new Dog("Tyke", 15, 3);
    }

    public static class Mouse {
        private String name;
        private int height;
        private int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        private String name;
        private int height;
        private int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        private String name;
        private int height;
        private int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
