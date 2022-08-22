package Testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SinTest {
    private Calculator calc;

    @BeforeClass(groups = {"sin"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "sin")
    public void testSinDouble(){
        double d = Math.toRadians(0);
        Assert.assertEquals(calc.sin(d),0,"The sin value of 0 degree is 0");
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
