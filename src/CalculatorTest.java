import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// This is a test comment to trigger Jenkins

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test void testAdd() { assertEquals(5, calc.add(2, 3)); }
    @Test void testDivideByZero() { assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0)); }
}
