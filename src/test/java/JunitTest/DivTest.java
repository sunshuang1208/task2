package JunitTest;
import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivTest {
    private static Calculator calc;

    @BeforeClass
    public static void init(){calc = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    @Test(expected = ArithmeticException.class)
    public void divide(){
        int result = (int) calc.div(6,0);//除法中，除数为0，抛出ArithmeticException
    }
}
