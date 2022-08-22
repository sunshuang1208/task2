package JunitTest;
import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultTest {
    private static Calculator calo;

    @BeforeClass
    public static void init(){calo = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    @Test
    public void multiply(){
        Assert.assertEquals(8,calo.mult(4,2));
    }
}
