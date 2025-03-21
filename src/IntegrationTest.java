import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    Calculator calc = new Calculator();

    @Test
    void testCombined() {
        int sum = calc.add(2, 3);
        assertEquals(20, calc.multiply(sum, 4));
    }
}
