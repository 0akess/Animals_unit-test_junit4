import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void eatMeatWithoutParametersReturnFood() throws Exception {
        final List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> returnValue = Arrays.asList("Животные", "Птицы", "Рыба");

        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(returnValue);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void getSoundWithoutParametersReturnSound() {
        final String expected = "Мяу";
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}