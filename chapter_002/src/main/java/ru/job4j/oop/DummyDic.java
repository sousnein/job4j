package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng){
        return "Неизвестное слово:"+eng;
    }

    public static void main(String[]args){
    DummyDic translate=new DummyDic();
    String result=translate.engToRus("Spoon");
    System.out.println(result);
    }
}
