import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensWithoutParametersGetOneKitten() {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
        System.out.println(feline.getKittens());
    }

    @Test
    public void getFamilyWithoutParametersGetFamily() {
        final String expected = "Кошачьи";
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatWithoutParametersGetFood() throws Exception {
        final String expected = "[Животные, Птицы, Рыба]";
        Feline feline = new Feline();
        String actual = String.valueOf(feline.eatMeat());
        assertEquals(expected, actual);
    }
}