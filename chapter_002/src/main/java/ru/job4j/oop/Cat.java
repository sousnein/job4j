package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;
    public void show() {
        System.out.println("Кот "+this.name+" съел "+this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick){
        this.name=nick;
    }

    public static void main(String[]args){
        Cat gav = new Cat();
        gav.giveNick("Gav-gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Big Black Boy");
        black.eat("fish");
        black.show();
    }
}
