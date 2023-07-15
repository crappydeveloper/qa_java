import com.example.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest
{
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самец" );

        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();

        assertEquals(1, actual);
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самец" );

        boolean actual = lion.doesHaveMane();

        assertTrue(actual);
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самка" );

        boolean actual = lion.doesHaveMane();

        assertFalse(actual);
    }

    @Test
    public void getFoodTest() throws Exception
    {
        Lion lion = new Lion(feline, "Самец");

        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Буйволы", "Зебры", "Дикообразы"));
        List<String> actual = lion.getFood();

        assertEquals(Arrays.asList("Буйволы", "Зебры", "Дикообразы"), actual);
    }
}