import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ProgramTest1 {

    @Test
    void testEvenNumber() {
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("4 là số chẵn.\nCác số từ 1 đến 4 là:\n1 2 3 4 ", ProgramOutputCapture.capture(() -> Program.main(new String[]{})));
    }

    @Test
    void testOddNumber() {
        String input = "7";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("7 là số lẻ.\nCác số từ 1 đến 7 là:\n1 2 3 4 5 6 7 ", ProgramOutputCapture.capture(() -> Program.main(new String[]{})));
    }

    @Test
    void testZero() {
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("0 là số chẵn.\nCác số từ 1 đến 0 là:", ProgramOutputCapture.capture(() -> Program.main(new String[]{})));
    }

    @Test
    void testNegativeNumber() {
        String input = "-5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("-5 là số lẻ.\nCác số từ 1 đến -5 là:\n1 2 3 4 5 ", ProgramOutputCapture.capture(() -> Program.main(new String[]{})));
    }
}
