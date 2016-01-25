import com.jackman.algorithm.InsertSortImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wujinlei on 2015/12/29.
 */
public class InsertSortTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsertSortTest.class);

    @Test
    public void insertSortTest() {
        int[] a = {23, 1, 20, -23, -1, 45};
        InsertSortImpl insertSort = new InsertSortImpl();
        insertSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            LOGGER.info(a[i] + " ");
        }
    }
}
