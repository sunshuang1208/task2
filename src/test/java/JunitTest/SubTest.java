package JunitTest;
import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubTest {
    private static Calculator calo;

    @BeforeClass
    public static void init(){calo = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    @Test
    public void testSub(){
        Assert.assertEquals(2,calo.sub(4,2));
    }
}
