package global.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new SumCalculator();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 3",
            "3, 6",
            "4, 10"
    })
    void testSum(int n, int expected) {
        assertEquals(expected, calc.sum(n));
    }

    @Test
    void shouldHandleSingleNumber() {
        assertEquals(15, calc.sum(5), "Сума для 5 має дорівнювати 15");
    }

    @Test
    public void shouldThrowExceptionWhenInputIsZeroOrNegative() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calc.sum(0));
    }
}