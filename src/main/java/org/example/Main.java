package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        final double PI = 3.14159;
        double volume = (4.0/3.0) * PI * R * R * R;
       
        System.out.printf(Locale.US, "VOLUME = %.3f%n", volume);
        
        sc.close();
    }
}