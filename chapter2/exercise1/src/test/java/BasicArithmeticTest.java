

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasicArithmeticTest {

    @Test
    public void testCalcSumAndCountAllNumbersDivBy_2_Or_7(){
        BasicArithmetic exercise = new BasicArithmetic();
        int[] result = exercise.calcSumAndCountAllNumbersDivBy_2_Or_7(15);
        int calcResult = exercise.calc(6,7);
        int calcResult2 = exercise.calc(3,4);
        int calcResult3 = exercise.calc(5,5);
        Assertions.assertEquals(8,result[0]);
        Assertions.assertEquals(63,result[1]);
        Assertions.assertEquals(0,calcResult);
        Assertions.assertEquals(6,calcResult2);
        Assertions.assertEquals(5,calcResult3);
    }
}