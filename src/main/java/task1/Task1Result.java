package task1;

public class Task1Result {

    /**
     * Задача 1
     * Числа, кратные 3 или 5
     * Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
     * Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
     */

    public static void main(String[] args) {

        System.out.println(new SumDivisibleBy(3).print() + new SumDivisibleBy(5).print());

    }
}
