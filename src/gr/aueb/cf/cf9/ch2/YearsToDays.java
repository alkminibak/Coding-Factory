package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * O χρηστης δινει την ηλικια του σε ετη (εστω ακεραιος)
 * και το προγραμμα επιστρεφει την ηλικια σε ημερες, οπου
 * θεωρουμε οτι ενα ετος = 365 ημερες. Πχ αν δοθει
 * ηλικια 20 ετων το αποτελεσμα ειναι 7300 ημερες.
 */
public class YearsToDays {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      final int DAYS_IN_YEAR = 365;  //ΟΡΙΖΩ ΤΗ ΣΤΑΘΕΡΑ - ΟΛΑ ΚΕΦΑΛΑΙΑ ΚΑΙ ΚΑΤΩ ΠΑΥΛΕΣ
      int inputAgeInYears = 0;
      int ageInDays = 0;

        System.out.println("Παρακαλω εισαγετε την ηλικια σας");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears + DAYS_IN_YEAR;

        System.out.printf("Ηλικια σε ετη %d, Ηλικία σε ημέρες %,d\n", inputAgeInYears, ageInDays);


    }
}
