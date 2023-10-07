/*Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
to a given maximum value (exclusive) and output it to the console. Write method void
calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
values instead of performing the console output.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BasicArithmetic {

    public int[] calcSumAndCountAllNumbersDivBy_2_Or_7(int _num) {
        int[] result = new int[2];
        int sum = 0;
        ArrayList numbers = new ArrayList<Integer>();

        for (int i = 1; i < _num; i++) {
            if (i % 2 == 0 || i % 7 == 0) {
                numbers.add(i);
            }
        }

        Set numbersSet = new HashSet<Integer>(numbers);

        result[0] = numbersSet.size();

        for (Object number: numbersSet){
            sum += (int) number;
        }

        result[1] = sum;

        return result;
    }
}