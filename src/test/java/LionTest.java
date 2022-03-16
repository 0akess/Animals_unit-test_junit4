import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Lion lion;

    @Test
    public void getKittensWithoutParametersGetOneKitten() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
        System.out.println(lion.getKittens());
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void doesHaveManeInvalidValueShowsStringException() throws Exception {
        final String expected = "Используйте допустимые значения пола животного - самец или самка";
        final String checkedText = "Оно";

        thrown.expect(Exception.class);
        thrown.expectMessage(expected);

        Lion lion = new Lion(checkedText);
    }

    @Test
    public void getFoodWithoutParametersGetFood() throws Exception {
        final String expected = "[Животные, Птицы, Рыба]";

        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        String actual = String.valueOf(lion.getFood());
        assertEquals(expected, actual);
    }
}