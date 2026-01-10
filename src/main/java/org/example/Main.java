package org.example;
import java.util.Scanner;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        double R = sc.nextDouble();
        double PI = 3.14159;
        double A = PI * R * R;


        System.out.printf("A=%.4f%n", A);
    }
}