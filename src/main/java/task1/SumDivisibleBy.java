package task1;

public class SumDivisibleBy {
    static final int LIMIT_NUMBER = 1000;
    int number;

    public SumDivisibleBy() {
    }

    public SumDivisibleBy(int number) {
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
}
