package binary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinaryTest {

    private String input;
    private Integer expectedOutput;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1", 1},
                {"10", 2},
                {"11", 3},
                {"100", 4},
                {"1001", 9},
                {"11010", 26},
                {"10001101000", 1128},
                {"", 0},
                {"2", 0},
                {"5", 0},
                {"9", 0},
                {"134678", 0},
                {"abc10", 0},
                {"10z", 0},
                {"10a10", 0},
                {"011", 3}
        });
    }

    public BinaryTest(String input, Integer expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void test() {
        Binary binary = new Binary(input);

        assertEquals(expectedOutput, binary.getDecimal());
    }
}
