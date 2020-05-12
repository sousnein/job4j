package ru.job4j.Golovach.io;


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Scannertrain {
        public static void main(String[] args) throws IOException {
    //    System.out.println("name");
     //   Scanner consoleRead = new Scanner(System.in);
    //    String name = consoleRead.nextLine();
       //     System.out.println("name: "+name);

           //     Scanner in = new Scanner(Path.of("C:\\Users\\tubzs\\Desktop\\file.txt"),
    //                    StandardCharsets.UTF_8);
     //          try( PrintWriter out = new PrintWriter("C:\\Users\\tubzs\\Desktop\\file2.txt")) {
     //              out.println(in);
    //           }

                     Scanner in = new Scanner(System.in);

                     System.out.print("How many numЬers do you "
                         + "need to draw? ");
                    int k = in.nextInt();

                     System.out.print("What is the highest numЬer you "
                         + "can draw? ");
                     int n = in.nextInt();

                     BigInteger lotteryOdds = BigInteger.valueOf(1);

                     for (int i = 1; i <= k; i++)
                     lotteryOdds = lotteryOdds.multiply(BigInteger
                         .valueOf(n-i+1))
                     .divide(BigInteger
                             .valueOf(i));

                     System.out.println("Your odds are 1 in "
                         + lotteryOdds +" Good luck!");
    }
}
