import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String checkedText;
    private final boolean expected;

    public LionParameterizedTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline feline;
    @Test()
    public void doesHaveManeSexGetBoolean() throws Exception {
        Lion lion = new Lion(checkedText, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
