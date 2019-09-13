package task1;

public class Task1 {

    /**
     * Задача 1
     * Числа, кратные 3 или 5
     * Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
     * Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
     */

    public int sumDivisibleBy(int number) {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % number == 0)
                sum += i;
        }
        return sum;
    }
}
