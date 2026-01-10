package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int number = sc.nextInt();
        int hoursWorked = sc.nextInt();
        double priceHour = sc.nextDouble();

        double salary = hoursWorked * priceHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}