package Problem3;


import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {


    static void higherNumber(long number) {
        List<Integer> lastNum = new ArrayList<>();

        final int N = 10000;
        int[] sieve = new int[N];

        for (int i = 2; i * i < N; ++i)
            if (sieve[i] == 0)
                for (int k = i * i; k < N; k += i)
                    sieve[k] = 1;

        System.out.println();

        for (int i = 2; i < N; i++) {
            if (sieve[i] == 0)
                if (number % i == 0) {
                    lastNum.add(i);
                }

        }
        System.out.println(lastNum.get(lastNum.size() - 1));


    }

    /**
     * Largest prime factor
     * Problem 3
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     */

    public static void main(String[] args) {
        long number = 600851475143L;
        higherNumber(number);
    }

}
