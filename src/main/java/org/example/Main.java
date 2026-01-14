package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int resthour = totalSeconds % 3600;

        int minutes = resthour/60;
        int seconds = totalSeconds % 60;


        System.out.println(hours + ":" + minutes + ":" + seconds);

        sc.close();
    }
}