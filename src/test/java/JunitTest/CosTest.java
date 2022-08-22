package JunitTest;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CosTest {
    private static Calculator calc;

    @BeforeClass
    public static void init(){calc = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    @Test
    public void CosTest(){
        double d = Math.toRadians(0);
        Assert.assertEquals(1,calc.cos(d),1);
    }
}
