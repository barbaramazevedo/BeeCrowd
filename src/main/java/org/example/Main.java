package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int codeProduct1 = sc.nextInt();
        int unitsProduct1 = sc.nextInt();
        double priceProduct1 = sc.nextDouble();

        int codeProduct2 = sc.nextInt();
        int unitsProduct2 = sc.nextInt();
        double priceProduct2 = sc.nextDouble();

        double amount = unitsProduct1 * priceProduct1 + unitsProduct2 * priceProduct2;

        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f%n", amount);

        sc.close();
    }
}