package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 *  Ένα προγραμμα που λαμβάνει απ΄το χρήστη
 *  ένα ποσό (ακέραιος) και το μετατρέπει σε δολάρια
 *  με βάση μια ισοτιμία. Για παράδειγμα αν ο χρήστης δώσει
 *  100€ και η ισοτιμία είναι 1 ευρώ = 99 USA cents, τοτε τα
 *  συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί σε 99 USA dollars
 *  και 0 USA cents.
 */
public class EuroToUsdConverter {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD_CONVERSION_RATE = 99;
        int inputEuro = 0;
        int totalUsacents = 0;
        int usaCents = 0;
        int usaDollars = 0;

        // Data Input
        System.out.println("Παρακαλω εισαγετε ένα ποσό σε ευρώ");
        inputEuro = scanner.nextInt();

        // Data Processing - Expressions
        totalUsacents = inputEuro * EURO_TO_USD_CONVERSION_RATE;
        usaDollars = totalUsacents / 100;
        usaCents = totalUsacents % 100;

        // Data Output
        System.out.printf("%d Euros = %d USD dollars και %d USD cents", inputEuro, usaDollars, usaCents);
    }
}