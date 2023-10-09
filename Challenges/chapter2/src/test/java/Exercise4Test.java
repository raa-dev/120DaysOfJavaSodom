import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

public class Exercise4Test {
    @ParameterizedTest(name = "testCalcPrimesUpTo({0}) = {1}")
    @MethodSource("expectedList")
    void testCalcPrimesUpTo(int number, List<Integer> expected) {
        Exercise4 exercise = new Exercise4();
        List<Integer> result = exercise.calcPrimesUpTo(number);
        assertEquals(expected,result);
    }
    private static Stream<Arguments> expectedList()
    {
        return Stream.of(
                Arguments.of(15, List.of(2,3,5,7,11,13)),
                Arguments.of(25, List.of(2,3,5,7,11,13,17,19,23)),
                Arguments.of(50, List.of(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47))
        );
    }
}