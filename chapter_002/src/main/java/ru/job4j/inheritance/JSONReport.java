package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{\n" + "\nname : " + name + "," +  "\nbody : " + body + "\n\n}";
    }
}