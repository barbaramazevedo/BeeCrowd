package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int agedays = sc.nextInt();

        int years = agedays / 365;
        int restyears = agedays % 365;

        int months = restyears/30;
        int restmonths = restyears % 30;

        int days = restmonths;


        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        sc.close();
    }
}