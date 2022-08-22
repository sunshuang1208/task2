package JunitTest;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SinTest {
    private static Calculator calc;

    @BeforeClass
    public static void init(){calc = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    @Test
    public void SinTest(){
        double d = Math.toRadians(0);
        Assert.assertEquals(0,calc.sin(d),1);
    }
}
