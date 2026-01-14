package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double value = sc.nextDouble();
        int convertToCents = (int) Math.round(value *100);

        int bill100 = convertToCents / 10000;
        int rest100 = convertToCents % 10000;

        int bill50 = rest100 / 5000;
        int rest50 = rest100 % 5000;

        int bill20 = rest50 / 2000;
        int rest20 = rest50 % 2000;

        int bill10 = rest20 / 1000;
        int rest10 = rest20 % 1000;

        int bill5 = rest10 / 500;
        int rest5 = rest10 % 500;

        int bill2 = rest5 / 200;
        int rest2 = rest5 % 200;

        int coin1 = rest2 / 100;
        int restCoin1 = rest2 % 100;

        int coin50 = restCoin1 / 50;
        int restCoin50 = restCoin1 % 50;

        int coin25 = restCoin50 / 25;
        int restCoin25 = restCoin50 % 25;

        int coin10 = restCoin25 / 10;
        int restCoin10 = restCoin25 % 10;

        int coin5 = restCoin10 / 5;

        int coin01 = restCoin10 % 5;

        System.out.println("NOTAS:");
        System.out.println(bill100 + " nota(s) de R$ 100.00");
        System.out.println(bill50 + " nota(s) de R$ 50.00");
        System.out.println(bill20 + " nota(s) de R$ 20.00");
        System.out.println(bill10 + " nota(s) de R$ 10.00");
        System.out.println(bill5 + " nota(s) de R$ 5.00");
        System.out.println(bill2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(coin1 + " moeda(s) de R$ 1.00");
        System.out.println(coin50 + " moeda(s) de R$ 0.50");
        System.out.println(coin25 + " moeda(s) de R$ 0.25");
        System.out.println(coin10 + " moeda(s) de R$ 0.10");
        System.out.println(coin5 + " moeda(s) de R$ 0.05");
        System.out.println(coin01 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}