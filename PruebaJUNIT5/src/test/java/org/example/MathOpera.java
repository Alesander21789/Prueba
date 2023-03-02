package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

public class MathOpera {

    static List<Arguments> testData() {
        return Arrays.asList(
                Arguments.of(2, 3, "addition", 5),
                Arguments.of(2, 3, "subtraction", -1),
                Arguments.of(2, 3, "multiplication", 6),
                Arguments.of(6, 3, "division", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void mathOperationTest(int x, int y, String operation, int expected) {
        //  Assertions.assertEquals(expected, mathOperation(x, y, operation));
    }
}
