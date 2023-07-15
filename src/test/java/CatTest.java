import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);

        String actual = cat.getSound(); // вызвали метод объекта с аргументом
        assertEquals("Мяу", actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);

        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Мясо", "Курица"));
        List<String> actual = cat.getFood();

        assertEquals(Arrays.asList("Мясо", "Курица"), actual);
    }
}