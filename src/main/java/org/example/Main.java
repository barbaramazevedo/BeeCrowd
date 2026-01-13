package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int km = sc.nextInt();

        int minutes = km * 2;

        System.out.println(minutes +" minutos");

        sc.close();
    }
}