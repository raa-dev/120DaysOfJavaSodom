import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Exercise3Test {
    Exercise3 exercise = new Exercise3();
    @ParameterizedTest(name = "testPerfectNumbers({0}) = {1}")
    @MethodSource("expectedList")
    public void testPerfectNumbers(int number, List<Integer> expected) {
        List<Integer> result = exercise.calcPerfectNumbers(number);
        assertEquals(expected,result);
    }

    private static Stream<Arguments> expectedList()
    {
        return Stream.of(Arguments.of(1000, List.of(6, 28, 496)),
            Arguments.of(10000, List.of(6, 28, 496, 8128)));
    }
}