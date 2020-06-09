import com.devin.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Devin
 * @Date: 2020/6/9 19:10
 */
public class TestSSM {
    /*
     *  用于测试: UserService
     * */
    @Test
    public void test0() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-conf/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.selectAll().forEach(user -> System.out.println("user = " + user));
    }
}
