import com.jackman.design.pattern.Login;
import com.jackman.design.pattern.LoginManager;
import org.junit.Test;

/**
 * Created by wujinlei on 2016/1/8.
 */
public class LoginTest {
    @Test
    public void LoginManager() {
        Login login = LoginManager.factory("password");
        login.verify("hello", "123456");
    }

    @Test
    public void stringTest(){
        String s = "abc";
        String s2 = new String(new char[]{'a','b','c'});
        System.out.println(s.equals(s2));
    }
}
