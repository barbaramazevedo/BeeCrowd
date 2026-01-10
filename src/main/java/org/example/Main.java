package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double MEDIA = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf(Locale.US, "MEDIA = %.1f%n", MEDIA);
    }
}