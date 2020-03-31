package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[]args) {
        Student student = new Student();
        student.setOwner("Отличник тот");
        student.setGroup("E04");
        student.setReceiptDate(new Date());

        System.out.println(student.getOwner() + " group : " + student.getGroup() + " receipt date : " + student.getReceiptDate());
    }
}
