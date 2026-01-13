package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        int hours = sc.nextInt();
        int averageSpeed = sc.nextInt();

        int distance = hours * averageSpeed;
        int performance = 12;

        double efficiency = (double) distance * 1 / performance;

        System.out.printf(Locale.US, "%.3f%n", efficiency);

        sc.close();
    }
}