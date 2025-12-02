package gr.aueb.cf.cf9.ch6;

/**
 * Ελεγχει αν ενα πινακας ακεραιων
 * ειναι συμμετρικος ή οχι
 * Συμμετρικός έιναι ένας πίνακας,
 * αν διαβάζεται το ίδιο από την αρχή
 * και το τέλος.
 * Για παράδειγμα
 * [1, 2, 3, 3, 2, 1] είναι συμμετρικός
 * και [1, 2, 3, 2, 1] επισης
 */
public class ArraySymmetric {
    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
//        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymmetric = false;
//                break;
                return false;
            }
        }
//      return isSymmetric;
        return true;
    }

}
