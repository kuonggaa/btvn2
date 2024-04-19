import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MainTest {

    @Test
    public void testPositiveNumber() {
        assertEquals("1 2 3 ", Main.generateSequence(3));
    }

    @Test
    public void testZeroNumber() {
        assertEquals("", Main.generateSequence(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("", Main.generateSequence(-5));
    }

    @Test
    public void testIsPositiveNumber() {
        assertTrue(Main.isPositiveNumber(10));
    }

    @Test
    public void testIsNotPositiveNumber() {
        assertFalse(Main.isPositiveNumber(-5));
    }
}
