package gr.aueb.cf.cf9.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int i = in.nextInt();
            int j = in.nextInt();
            int k = i/j;
            System.out.println(k);  }
        catch (ArithmeticException e2) {
            System.out.println(e2.getMessage());
        }
    }


}
