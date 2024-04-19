import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MainTest1 {

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

    @Test
    public void testMainWithPositiveNumber() {
        String expectedOutput = "Nhập vào một số nguyên dương: Các số từ 1 đến 3 là:\n1 2 3 ";
        assertEquals(expectedOutput, getMainOutputForInput(3));
    }

    @Test
    public void testMainWithZeroNumber() {
        String expectedOutput = "Nhập vào một số nguyên dương: ";
        assertEquals(expectedOutput, getMainOutputForInput(0));
    }

    @Test
    public void testMainWithNegativeNumber() {
        String expectedOutput = "Nhập vào một số nguyên dương: Số bạn nhập không phải là số nguyên dương.";
        assertEquals(expectedOutput, getMainOutputForInput(-5));
    }

    private String getMainOutputForInput(int input) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        String inputString = Integer.toString(input) + System.getProperty("line.separator");
        System.setIn(new java.io.ByteArrayInputStream(inputString.getBytes()));
        Main.main(new String[0]);
        return outContent.toString();
    }
}
