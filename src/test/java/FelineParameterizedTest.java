import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int sumKittens;
    private final int expected;

    public FelineParameterizedTest(int checkedText, int expected) {
        this.sumKittens = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {5, 5},
                {123, 123},
                {10, 10},
        };
    }
    @Test()
    public void getKittensNumberOfKittensGetNumberOfKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(sumKittens);
        assertEquals(expected, actual);
    }
}