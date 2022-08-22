package Testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CosTest {
    private Calculator calc;

    @BeforeClass(groups = {"cos"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "cos")
    public void testCosDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.cos(d),1,"The cosine value of 0 degree is 1");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
