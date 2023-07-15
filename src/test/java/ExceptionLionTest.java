import com.example.Feline;
import com.example.Lion;
import org.junit.Test;


public class ExceptionLionTest {
    @Test(expected = Exception.class)
    public void incorrectSexException() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Абоба");
    }
}
