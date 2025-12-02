package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα σημείο x, να πάει σε ένα σημείο y
 * όπου κάθε απόσταση είναι jump.
 *
 * Έστω οτι
 * start = 10
 * end = 55
 * jump = 25
 */
public class FrogJumps {
    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump) {

        if ((end - start) % jump == 0) {
            return (end - start) / jump;
        } else {
            return ((end - start) / jump) + 1;
        }
    }



}
