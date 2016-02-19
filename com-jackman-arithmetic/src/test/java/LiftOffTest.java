import com.jackman.thread.LiftOff;
import org.junit.Test;

/**
 * Created by JackMan on 2016/1/21.
 */
public class LiftOffTest {

    @Test
    public void liftOffTest() {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for liftoff!");
    }

    @Test
    public void moreBasicThreads() {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff!");
    }
}
