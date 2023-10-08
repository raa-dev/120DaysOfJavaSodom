/*Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
to a given maximum value (exclusive) and output it to the console. Write method void
calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
values instead of performing the console output.
*/
import java.util.ArrayList;
import java.util.ListIterator;
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

    /*Write method int calc(int, int) that multiplies two variables, m and n of type int,
    then divides the product by two, and outputs the remainder with respect to division by 7.*/

    public int calc(int m, int n) {
        return ((m * n)/2) % 7;
    }

    /*Create a method boolean isOddorEven(n) that will check if the
    passed integer is even or odd, (True if even; False if odd).*/
    public boolean isOddOrEven(int n){
        return n % 2 == 0;
    }

    /*Write method String numberAsText(int) which, for a given positive number, converts
    the respective digits into corresponding text.
    Start with the following fragment for the last digit of a number:*/
    public String numberAsText(final int n) {
        // Using the StringBuilder class to create mutable strings.
        StringBuilder digitAsText = new StringBuilder();
        String valueAsText = "";
        // Calling our auxiliary method to get a list of digits
        ArrayList<Integer> digitList = new ArrayList<>();
        digitList = this.extractDigits(n);

        while (digitList.size() > 0) {
            int index = digitList.size() - 1;
            int value = digitList.remove(index);

            // Using Switch - Case (We're evaluating the remainder and assigning valueAsText the name of the digits
            switch (value) {
                case 1:
                    valueAsText = "ONE";
                    break;
                case 2:
                    valueAsText = "TWO";
                    break;
                case 3:
                    valueAsText = "THREE";
                    break;
                case 4:
                    valueAsText = "FOUR";
                    break;
                case 5:
                    valueAsText = "FIVE";
                    break;
                case 6:
                    valueAsText = "SIX";
                    break;
                case 7:
                    valueAsText = "SEVEN";
                    break;
                case 8:
                    valueAsText = "EIGHT";
                    break;
                case 9:
                    valueAsText = "NINE";
                    break;
                default:
                    valueAsText = "ZERO";
                    break;
            }
            digitAsText.append(valueAsText).append(" ");
        }
        // Remove the last trailing space if the StringBuilder is not empty
        digitAsText.setLength(digitAsText.length() - 1);
        return digitAsText.toString();
    }

    // Auxiliary method to extract digits from a number
    ArrayList<Integer> extractDigits(final int startValue) {
        int remainingValue = startValue;
        ArrayList<Integer> digitList = new ArrayList<>();
        while (remainingValue > 0) {
            final int digit = remainingValue % 10;
            digitList.add(digit);
            remainingValue = remainingValue / 10;
        }
        return digitList;
    }
}