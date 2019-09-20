package Problem1;

public class Multiples {
    static final int LIMIT_NUMBER = 1000;
    int number;

    public Multiples() {
    }

    public Multiples(int number) {
        this.number = number;
    }

    public int print() {
        int sum = 0;
        for (int i = 0; i < LIMIT_NUMBER; i++) {
            if (i % number == 0)
                sum += i;
        }
        return sum;
    }

    /**
     * Multiples of 3 and 5
     * Problem 1
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public static void main(String[] args) {
        System.out.println(new Multiples(3).print() + new Multiples(5).print());
    }
}
