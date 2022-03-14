import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String checkedText;
    private final String expected;

    public AnimalParameterizedTest(String checkedText, String expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Травоядное", "[Трава, Различные растения]"},
                {"Хищник", "[Животные, Птицы, Рыба]"},
        };
    }

    @Test()
    public void getFoodTypeAnimalReturnFood() throws Exception {
        Animal animal = new Animal();
        String actual = String.valueOf(animal.getFood(checkedText));
        assertEquals(expected, actual);
    }
}
