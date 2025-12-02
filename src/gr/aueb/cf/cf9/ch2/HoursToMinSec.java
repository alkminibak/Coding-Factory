package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * calculates hours to minutes and seconds for a given number of hours
 */
public class HoursToMinSec {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποιηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_HOUR = 3600;
        int inputHour = 0;
        int hourInMinutes = 0;
        int hourInSeconds = 0;

        // Εντολές
        // Πάρε input από τον χρήστη -- data binding
        System.out.println("Παρακαλω εισαγετε την ώρα");
        inputHour = scanner.nextInt();

        // Επεργάσου το input -- expressions
        hourInMinutes = inputHour * MINUTES_IN_HOUR;
        hourInSeconds = inputHour * SECONDS_IN_HOUR;

        // Δώσε στο χρήστη το αποτέλεσμα
        System.out.printf("Ειναι %d λεπτά", hourInMinutes);
        System.out.printf(" και %,d δευτερόλεπτα", hourInSeconds);
    }
}
