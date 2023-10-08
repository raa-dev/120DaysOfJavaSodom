import java.util.ArrayList;

public class Exercise2 {

    /*Write method String numberAsText(int) which, for a given positive number, converts
    the respective digits into corresponding text.
    Start with the following fragment for the last digit of a number:*/
    public String numberAsText(final int n) {
        // Using the StringBuilder class to create mutable strings.
        StringBuilder digitAsText = new StringBuilder();
        String valueAsText = "";
        ArrayList<Integer> digitList = this.extractDigits(n);

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
