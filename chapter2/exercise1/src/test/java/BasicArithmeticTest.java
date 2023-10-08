

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class BasicArithmeticTest {
    BasicArithmetic exercise = new BasicArithmetic();

    @Test
    public void testCalcSumAndCountAllNumbersDivBy_2_Or_7(){
        // Testing our calcSum method
        int[] result = exercise.calcSumAndCountAllNumbersDivBy_2_Or_7(15);
        Assertions.assertEquals(8,result[0]);
        Assertions.assertEquals(63,result[1]);
    }

    @Test
    public void testCalc() {
        // Testing our calc method
        int calcResult = exercise.calc(6,7);
        int calcResult2 = exercise.calc(3,4);
        int calcResult3 = exercise.calc(5,5);
        Assertions.assertEquals(0,calcResult);
        Assertions.assertEquals(6,calcResult2);
        Assertions.assertEquals(5,calcResult3);
    }

    @Test
    public void testIsOddOrEven() {
        // Testing our isOddOrEven method (True if even, False if odd)
        boolean oddOrEvenResult = exercise.isOddOrEven(2); // True
        boolean oddOrEvenResult2 = exercise.isOddOrEven(3); // False
        boolean oddOrEvenResult3 = exercise.isOddOrEven(666);
        boolean oddOrEvenResult4 = exercise.isOddOrEven(69);
        Assertions.assertTrue(oddOrEvenResult);
        Assertions.assertFalse(oddOrEvenResult2);
        Assertions.assertTrue(oddOrEvenResult3);
        Assertions.assertFalse(oddOrEvenResult4);
    }

    @Test
    public void testNumberAsText() {
        String digitList = exercise.numberAsText(42);
        String digitList2 = exercise.numberAsText(24680);
        String digitList3 = exercise.numberAsText(13579);
        Assertions.assertEquals("FOUR TWO", digitList);
        Assertions.assertEquals("TWO FOUR SIX EIGHT ZERO", digitList2);
        Assertions.assertEquals("ONE THREE FIVE SEVEN NINE", digitList3);
    }
}