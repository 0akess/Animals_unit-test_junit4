import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeatWithoutParametersGetFood() throws Exception {
        final List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");

        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutParametersGetOneKitten() {
        final int expected = 1;

        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyWithoutParametersGetFamily() {
        final String expected = "Кошачьи";

        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}