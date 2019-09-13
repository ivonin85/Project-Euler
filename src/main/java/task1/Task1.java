package task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /**
     * Задача 1
     * Числа, кратные 3 или 5
     * Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
     * Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
     */

    public int multipleNumbers(int number) {
        int sum = 0;
        List<Integer> listMultipleNumbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if (i % number != 0) continue;
            listMultipleNumbers.add(i);
        }

        for (int i = 0; i < listMultipleNumbers.size(); i++) {
            sum += listMultipleNumbers.get(i);
        }
        return sum;
    }
}
