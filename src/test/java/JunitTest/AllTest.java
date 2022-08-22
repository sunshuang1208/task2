package JunitTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SubTest.class,
        PowTest.class,
        SumTest.class,
        DivTest.class,
        MultTest.class,
        TimeoutTest.class,
        SqrtTest.class,
        SinTest.class,
        CosTest.class,
        TgTest.class
})
public class AllTest {

}