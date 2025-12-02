package gr.aueb.cf.cf9.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Ο χρηστης δινει το βαρος σε κιλά (ακεραια) και τα μετατρεπει
 * σε γραμμαρια (όπου 1κιλο = 1000γραμμαρια)
 */
public class KiloToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int GRAMS_IN_KILO = 1000;
        int inputWeightInKilos = 0;
        int weightInGrams = 0;

        System.out.println("Παρακαλώ εισάγετε το βαρος σε κιλα");
        inputWeightInKilos = scanner.nextInt();
        weightInGrams = inputWeightInKilos * GRAMS_IN_KILO;

        System.out.printf("To βαρος σε γραμμαρια είναι: %,d", weightInGrams);

    }
}
