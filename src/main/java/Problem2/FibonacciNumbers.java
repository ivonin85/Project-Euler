package Problem2;

public class FibonacciNumbers {

    int limit;

    public FibonacciNumbers(int limit) {
        this.limit = limit;
    }

    public int countingNumbers() {

        int n0 = 1;
        int n1 = 1;
        int n2;
        int sum = 0;

        for(int i = 3; i <= 50; i++){

            n2=n0+n1;
            if (n2 >= limit) break;
            if (n2% 2 == 0)
                sum += n2;

            n0=n1;
            n1=n2;

        }
        return sum;
    }
}
