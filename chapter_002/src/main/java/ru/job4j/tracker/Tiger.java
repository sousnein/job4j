package ru.job4j.tracker;

public class Tiger extends Predator {
    public Tiger() {
        System.out.println("load tiger");
    }
    public Tiger(String name) {
        super(name);
        System.out.println(name);
    }
}
