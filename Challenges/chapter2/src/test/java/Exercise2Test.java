import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2Test {
    Exercise2 exercise = new Exercise2();
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
