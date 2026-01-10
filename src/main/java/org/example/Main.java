package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}