package ru.job4j.tracker;

public class Animal {
    public Animal() {
        super();
        System.out.println("load animal");
    }
    public Animal(String name) {
    }
    public static void main(String[]args) {
        Tiger tiger = new Tiger();
        Tiger tiger1 = new Tiger("sheesh");
    }
}
