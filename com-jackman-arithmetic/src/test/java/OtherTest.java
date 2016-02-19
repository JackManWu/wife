import org.junit.Test;

import java.io.ByteArrayOutputStream;

/**
 * Created by JackMan on 2016/2/1.
 */
public class OtherTest {
    @Test
    public void ByteArrayOutputStreamTest() throws Exception {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[]{0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67,
                0x30, 0x31, 0x32, 0x33, 0x34, 0x35};
        System.out.println("字节码："+bytes.toString());
        outputStream.write(bytes);
        System.out.println(outputStream.toString());
        System.out.println(outputStream.size());

        outputStream.reset();
        System.out.println(outputStream.size());
        System.out.println(outputStream.toString());
    }
    @Test
    public void isBoolean(){
        if(2==2){
            System.exit(0);
            return;
        }
    }
}
