import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    void ifNumbeEqualsToZero() {
        Factorial factorial = new Factorial(0);

        int result = factorial.fact();

        assertEquals(1,result);

    }

    @Test
    void ifNumberEqualsToOne() {
        Factorial factorial = new Factorial(1);

        int result = factorial.fact();

        assertEquals(1,result);
    }

    @Test
    void ifNumberGreaterThanOne() {
        Factorial factorial = new Factorial(5);

        int result = factorial.fact();
        assertEquals(120,result);
    }

    @Test
    void ifNumberLessThanZero() {
        Factorial factorial = new Factorial(-1);

        assertThrows(IllegalArgumentException.class,()->factorial.fact());

    }
}
