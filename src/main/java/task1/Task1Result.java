package task1;

public class Task1Result {

    public static void main(String[] args) {
        SumDivisibleBy sumDivisibleBy3 = new SumDivisibleBy(3);
        SumDivisibleBy sumDivisibleBy5 = new SumDivisibleBy(5);
        System.out.println(sumDivisibleBy3.sumDivisibleBy() + sumDivisibleBy5.sumDivisibleBy());

    }
}
