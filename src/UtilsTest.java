import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
    @Test void testIsPositive() { assertTrue(Utils.isPositive(10)); }
    @Test void testIsEven() { assertTrue(Utils.isEven(8)); }
}
