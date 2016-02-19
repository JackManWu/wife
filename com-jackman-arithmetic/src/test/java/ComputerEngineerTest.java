import com.jackman.design.pattern.抽象工厂模式.AbstractFactory;
import com.jackman.design.pattern.抽象工厂模式.AmdFactory;
import com.jackman.design.pattern.抽象工厂模式.ComputerEngineer;
import org.junit.Test;

/**
 * Created by JackMan on 2016/1/25.
 */
public class ComputerEngineerTest {
    @Test
    public void makeComputerTest() {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory af = new AmdFactory();
        engineer.makeComputer(af);
    }
}
