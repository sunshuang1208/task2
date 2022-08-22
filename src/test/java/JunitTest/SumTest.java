package JunitTest;
import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    private static Calculator calo;

    @BeforeClass
    public static void init(){calo = new Calculator();}

    @AfterClass
    public static void tearDown(){System.out.println("Test done.");}

    /*测试加法*/
    @Test
    public void testAdd(){
        //断言判断值是否相等
        assertEquals(3,calo.sum(1,2));
    }
}