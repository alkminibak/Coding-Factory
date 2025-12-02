package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 *  Δοθέντος ενός {@link String} επιστρέφει ένα String
 *  που αποτελεί επανάληψη του αρχικού String, n φορές
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static String repeatString(String s, int n) {
        return s.repeat(n);  // υπάρχει έτοιμη μέθοδος στα java docs


//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= n; i++) {
//            sb.append(i);
//        }
//        return

    }

}
