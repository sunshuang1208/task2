package JunitTest;

import org.junit.Test;

public class TimeoutTest {
    @Test(timeout = 3000)
    public void testTimeout(){
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
