import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void eatMeatWithoutParametersReturnFood() throws Exception {
        final String expected = "[Животные, Птицы, Рыба]";

        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = String.valueOf(cat.getFood());
        assertEquals(expected, actual);
    }

    @Test
    public void getSoundWithoutParametersReturnSound() {
        final String expected = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}