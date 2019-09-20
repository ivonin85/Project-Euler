package Problem3;


import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    static void higherNumber() {
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
                if (600851475143L % i == 0) {
                    lastNum.add(i);
                }

        }
        System.out.println(lastNum.get(lastNum.size() - 1));


    }

    public static void main(String[] args) {
        higherNumber();
    }

}
