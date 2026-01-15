package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int city = 1;

        while (true) {
            int quantity = sc.nextInt();
            if (quantity == 0) break;

            Map<Integer, Integer> map = new TreeMap<>();

            int totalResidents = 0;
            int totalConsumption = 0;

            for (int i = 0; i < quantity; i++) {

                int residents = sc.nextInt();
                int consumption = sc.nextInt();

                int consumptionPerPerson = consumption / residents;

                map.put(
                        consumptionPerPerson,
                        map.getOrDefault(consumptionPerPerson, 0) + residents
                );

                totalResidents += residents;
                totalConsumption += consumption;
            }

            System.out.println("Cidade# " + city +":");

            boolean first = true;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (!first) System.out.print(" ");
                System.out.print(entry.getValue() + "-" + entry.getKey());
                first = false;
            }
            System.out.println();

            double average = (double) totalConsumption / totalResidents;
            average = Math.floor(average * 100) / 100;

            System.out.printf(Locale.US, "Consumo medio: %.2f m3.%n", average );


        city++;
        }
        sc.close();
    }
}