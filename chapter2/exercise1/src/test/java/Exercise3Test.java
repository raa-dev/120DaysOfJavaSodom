import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Exercise3Test {
    Exercise3 exercise = new Exercise3();
    @Test
    public void testPerfectNumbers() {
        List<Integer> result3 = exercise.calcPerfectNumbers(1000);
        assertEquals(List.of(6,28,496),result3);
        List<Integer> result = exercise.calcPerfectNumbers(10000);
        assertEquals(List.of(6,28,496,8128),result);
    }
}