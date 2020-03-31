package ru.job4j.pojo;

public class Library {
    public static void main(String[]args) {
        Book book1 = new Book("Clean Code", 975);
        Book book2 = new Book("Hobbit", 868);
        Book book3 = new Book("1984", 753);
        Book book4 = new Book("Three Comrades", 888);

        Book[] library = new Book[4];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;

        System.out.println("Исходный массив");
        for (int index = 0; index < library.length; index++) {
            Book bk = library[index];
            System.out.println(bk.getTitle() + " - " + bk.getPages() + " страниц");
        }

        library[0] = book4;
        library[3] = book1;
        System.out.println("массив с переставленными индексами");
        for (int index = 0; index < library.length; index++) {
            Book bk = library[index];
            System.out.println(bk.getTitle() + " - " + bk.getPages() + " страниц");
        }

        System.out.println("Книга с именем 'Clean code'");
        for (int index = 0; index < library.length; index++) {
            Book bk = library[index];
            if (bk.getTitle() == "Clean Code") {
                System.out.println(bk.getTitle() + " - " + bk.getPages() + " страниц");
            }
        }
    }
}
