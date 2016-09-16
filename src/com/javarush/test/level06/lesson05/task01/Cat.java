package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
*/

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " destroyed in finalize method");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat = null;
        System.gc();
    }
}
