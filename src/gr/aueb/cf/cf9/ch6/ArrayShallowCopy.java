package gr.aueb.cf.cf9.ch6;

/**
 * Όταν κάνουμε copy references, τότε
 * το copy ονομάζεται swallow και έχει
 * side effects.
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arrCopy = arr;  // Swallow copy: αντιγραφή δείκτη, όχι περιεχομένων
                              // Δείχουν και τα δύο στην ιδια θέση
        arrCopy[0] = 1000;
        System.out.println(arr[0]);
    }
}
