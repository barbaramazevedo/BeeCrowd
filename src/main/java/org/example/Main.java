package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {


            int N1 = sc.nextInt();
            sc.next();
            int D1 = sc.nextInt();

            String OP = sc.next();

            int N2 = sc.nextInt();
            sc.next();
            int D2 = sc.nextInt();

            int num = 0;
            int den = 0;

            if (OP.equals("+")) {
                num=  (N1*D2 + N2*D1);
                den= (D1*D2);
            } else if (OP.equals("-")) {
                num=  (N1*D2 - N2*D1);
                den= (D1*D2);
            } else if (OP.equals("*")) {
                num = (N1 * N2);
                den = (D1 * D2);
            } else if (OP.equals("/")) {
                num = (N1 * D2);
                den = (N2 * D1);
            }
            int divisor = mdc(num, den);

            int simpNum = num / divisor;
            int simpDen = den / divisor;

            System.out.println(num + "/" + den + " = " + simpNum + "/" + simpDen);
        }
        sc.close();
    }

    static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}