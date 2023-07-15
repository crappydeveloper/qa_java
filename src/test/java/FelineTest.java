import com.example.Feline;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest
{
    @Test
    public void eatMeatTest() throws Exception
    {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamilyTest()
    {
        Feline feline = new Feline();
        String actual = feline.getFamily();

        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensWithoutParametersTest()
    {
        Feline feline = new Feline();
        int actual = feline.getKittens();

        assertEquals(1, actual);
    }

    @Test
    public void getKittensWithParametersTest()
    {
        Feline feline = new Feline();
        int actual = feline.getKittens(2);

        assertEquals(2, actual);
    }
}