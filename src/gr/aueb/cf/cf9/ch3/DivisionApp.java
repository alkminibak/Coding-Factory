package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει δυο τιμες, αριθμητη και
 * παρονομαστή και το προγραμμα υπολογιζει
 * το πηλικο, επαναληπτικά
 *
 * Αν ο αριθμητής είναι μηδεν τοτε το προγραμμα διακοπτεται
 * Αν ο παρονοαστης ειναι μηδεν, τοτε η διαδικασια επαναλμβάνεται
 */
public class DivisionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0. Quiting . . . .");
                break;
            }

            System.out.println("Please enter a denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Cannot divide by zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result: " + result);

        }
    }
}
