package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distanceBetween = Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf(Locale.US, "%.4f%n", distanceBetween);

        sc.close();
    }
}