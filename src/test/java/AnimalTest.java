import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.assertEquals;

public class AnimalTest {

        @Test
    public void getFamilyWithoutParametersGetString() {
        final String expected = "Существует несколько семейств: заячьи, " +
                "беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test()
    public void getFoodInvalidStringGetException() throws Exception {
        final String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        final String checkedText = "всеядное";

        thrown.expect(Exception.class);
        thrown.expectMessage(expected);

        Animal animal = new Animal();
        String.valueOf(animal.getFood(checkedText));
    }
}
