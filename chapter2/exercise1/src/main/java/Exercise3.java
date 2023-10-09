import java.util.ArrayList;
import java.util.List;

/**
 * By definition, a natural number is called a perfect number if its value is equal to the sum
 * of its real divisors. This is true, for example, for the numbers 6 and 28:
 * 1+2+3=6
 * 1 + 2 + 4 + 7 + 14 = 28
 */
public class Exercise3 {
    /**
     * @param number to be validated
     * @return divisors list composing the perfect number
     */
    List<Integer> calcPerfectNumbers(int number) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            int sum = 0;
            List<Integer> divisors = new ArrayList<>();
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                }
            }
            for (int number_ : divisors){
                sum += number_;
            }
            if (sum == i){
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }
}
