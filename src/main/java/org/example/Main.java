package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        int quantity100 = value / 100;
        int resto100 = value % 100;

        int quantity50 = resto100 / 50;
        int resto50 =  resto100 % 50;

        int quantity20 = resto50 / 20;
        int resto20 =  resto50 % 20;

        int quantity10 = resto20 / 10;
        int resto10 =  resto20 % 10;

        int quantity5 = resto10 / 5;
        int resto5 =  resto10 % 5;

        int quantity2 = resto5 / 2;
        int resto2 =  resto5 % 2;

        int quantity1 = resto2;


        System.out.println(value);
        System.out.println(quantity100 + " nota(s) de R$ 100,00");
        System.out.println(quantity50 + " nota(s) de R$ 50,00");
        System.out.println(quantity20 + " nota(s) de R$ 20,00");
        System.out.println(quantity10 + " nota(s) de R$ 10,00");
        System.out.println(quantity5 + " nota(s) de R$ 5,00");
        System.out.println(quantity2 + " nota(s) de R$ 2,00");
        System.out.println(quantity1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}