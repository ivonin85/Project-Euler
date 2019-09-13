package task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public int multipleNumbers(int number){
        int sum = 0;
        List<Integer> listMultipleNumbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++)
        {if (i%number != 0) continue;
            listMultipleNumbers.add(i);}

        for(int i = 0; i < listMultipleNumbers.size(); i++){
            sum += listMultipleNumbers.get(i);
        }
        return sum;
    }
}
