import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class BasicArithmeticTest {

    @Test
    public void testCalcSumAndCountAllNumbersDivBy_2_Or_7(){
        BasicArithmetic exercise = new BasicArithmetic();
        int[] result = exercise.calcSumAndCountAllNumbersDivBy_2_Or_7(15);
        Assertions.assertEquals(8,result[0]);
        Assertions.assertEquals(63,result[1]);
    }
}