package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        final double PI = 3.14159;
        double triangle = A * C / 2;
        double circle = PI * C * C;
        double trapezium = (A + B) * C / 2;
        double square = B * B;
        double rectangle = A * B;

        System.out.printf(Locale.US, "TRIANGULO: %.3f%n", triangle);
        System.out.printf(Locale.US, "CIRCULO: %.3f%n", circle);
        System.out.printf(Locale.US, "TREPEZIO: %.3f%n", trapezium);
        System.out.printf(Locale.US, "QUADRADO: %.3f%n", square);
        System.out.printf(Locale.US, "RETANGULO: %.3f%n", rectangle);

        sc.close();
    }
}