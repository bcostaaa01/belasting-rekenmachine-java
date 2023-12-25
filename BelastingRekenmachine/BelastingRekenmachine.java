
package BelastingRekenmachine;

import java.util.Scanner;

public class BelastingRekenmachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Voor welk jaar wilt u de belastingtarieven weten?");
        int belastingJaar = input.nextInt();

        if (belastingJaar == 2024) {
            System.out.println("Belastingtarieven 2024");
            System.out.println("Belastingtarieven voor uw inkomen uit werk en woning:");

            System.out.println("Belastingschijf\tBelastbaar inkomen uit werk en woning\tTarief");
            System.out.println("1\ttot € 75.518\t36,97%");
            System.out.println("2\tvanaf € 75.518\t49,50%");

            System.out.println("Voer uw inkomen uit werk en woning in: ");
            double inkomen = input.nextDouble();

            double belasting = berekenBelasting2024(inkomen);
            System.out.println("Uw belasting is: " + belasting);
        } else if (belastingJaar == 2023) {
            System.out.println("Belastingtarieven 2023");
            System.out.println("Belastingtarieven voor uw inkomen uit werk en woning:");

            System.out.println("Belastingschijf\tBelastbaar inkomen uit werk en woning\tTarief");
            System.out.println("1\ttot € 73.031\t36,93%\n");
            System.out.println("2\tvanaf € 73.031\t49,50%\n");

            System.out.println("Voer uw inkomen uit werk en woning in: ");
            double inkomen = input.nextDouble();

            double belasting = berekenBelasting2023(inkomen);
            System.out.println("Uw belasting is: " + belasting);
        }

        input.close();
    }

    // Methode om belasting te berekenen voor het jaar 2024
    public static double berekenBelasting2024(double inkomen) {
        if (inkomen <= 75518) {
            return inkomen * 0.3697;
        } else {
            return inkomen * 0.495;
        }
    }

    // Methode om belasting te berekenen voor het jaar 2023
    public static double berekenBelasting2023(double inkomen) {
        if (inkomen <= 73031) {
            return inkomen * 0.3693;
        } else {
            return inkomen * 0.495;
        }
    }
}
