package gr.aueb.cf.cf9.ch2;

public class RandomApp {
    /**
     * Παραγει ενα τυχαιο ακεραιο μεταξυ 1-6 (ζαρι)
     */
    public static void main(String[] args) {
        int die = 0;

        die = (int) (Math.random() * 6) +1;    //typecast

        System.out.println(die);

    }
}
