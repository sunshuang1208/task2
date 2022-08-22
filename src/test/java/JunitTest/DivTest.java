package JunitTest;
import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivTest {
    private static Calculator calo;

    @BeforeClass
    public static void init(){calo = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    @Test
    public void divide(){
        Assert.assertEquals(2,calo.div(4,2));
    }
}
