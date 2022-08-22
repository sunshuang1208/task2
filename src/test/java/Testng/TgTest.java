package Testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TgTest {
    private Calculator calc;

    @BeforeClass(groups = {"tan"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "tan")
    public void testTanDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.tg(d),0,"The cosine value of 0 degree is 0");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
