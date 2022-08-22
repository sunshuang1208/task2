package Testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivTest {
    private Calculator calc;

    @BeforeClass(groups = {"divide"})
    public  void init(){
        System.out.println("Test started...");
        calc = new Calculator();
    }

    @Test(groups = "divide")
    public void testDiv(){
        Assert.assertEquals(calc.div(2,1),2,"The result is 2");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void testDiv2(){
        double a = Math.random();
        double b = Math.random();
        double c = a/b;
        if(b == 0){
            System.out.println("除数为0，异常");
            throw new RuntimeException();
        }
    }

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}
}
