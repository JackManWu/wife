import com.jackman.design.pattern.工厂方法模式.ExportFactory;
import com.jackman.design.pattern.工厂方法模式.ExportFile;
import com.jackman.design.pattern.工厂方法模式.ExportHtmlFactory;
import org.junit.Test;

/**
 * Created by JackMan on 2016/1/25.
 */
public class ExportFactoryTest {
    @Test
    public void exportTest(){
        ExportFactory factory = new ExportHtmlFactory();
        ExportFile exportFile = factory.factory("standard");
        exportFile.export("");
    }
}
