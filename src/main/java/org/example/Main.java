package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double average = (double) X/Y;

        System.out.printf(Locale.US, "%.3f km/l%n", average);

        sc.close();
    }
}