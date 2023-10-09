import java.util.ArrayList;
import java.util.List;

/**
 * Write method List<Integer> calcPrimesUpTo(int) to compute all prime numbers up
 * to a given value. As a reminder, a prime number is a natural number greater than 1 and
 * exclusively divisible by itself and by 1. To compute a prime number, the so-called Sieve
 * of Eratosthenes was described before.
 */
public class Exercise4 {
    /**
     * @param num limit to get all the numbers up to it
     * @return a List of all the prime numbers
     */
    public List<Integer> calcPrimesUpTo(int num) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    /**
     * @param n number to be validated
     * @return a boolean based on whether is a primer number or not
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}