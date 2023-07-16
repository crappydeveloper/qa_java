import com.example.Lion;
import com.example.Feline;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {
    private final String sex;
    private final boolean expected;
    Feline feline;

    public ParameterizedLionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Наличие/отсутствие гривы у льва. Тестовые данные: {0} {1}")
    public static Object[][] getLionData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkIfHasMane() throws Exception {
        Lion lion = new Lion(feline, sex);

        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }
}