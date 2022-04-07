import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

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

    @Test()
    public void getFoodInvalidStringGetException(){
        final String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        final String checkedText = "всеядное";

        Animal animal = new Animal();

        try {
            animal.getFood(checkedText);
            Assert.fail("Исключение не отработало");
        } catch (Exception thrown){
            assertEquals(expected, thrown.getMessage());
        }
    }
}
