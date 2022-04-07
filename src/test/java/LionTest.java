import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensWithoutParametersGetOneKitten() throws Exception {
        final int kitten = 0;

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(kitten);
        int actual = lion.getKittens();
        assertEquals(kitten, actual);
    }

    @Test
    public void getFoodWithoutParametersGetFood() throws Exception {
        final List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> returnValue = Arrays.asList("Животные", "Птицы", "Рыба");

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(returnValue);
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeInvalidValueShowsStringException() throws Exception {
        final String expected = "Используйте допустимые значения пола животного - самец или самка";
        final String checkedText = "Оно";

        try {
            Lion lion = new Lion(checkedText, feline);
            Assert.fail("Тест провален, конструктор обработал неизвестное значение");
        } catch (Exception thrown){
            assertEquals(expected, thrown.getMessage());
        }
    }
}