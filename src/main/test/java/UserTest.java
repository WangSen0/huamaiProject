import com.hengzhi.entity.User;
import com.hengzhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/11/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class UserTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void findUserTest(){
        User user = new User();
        user.setUsername("123");
        user.setPassword("123");
        User userResult = userMapper.findUser(user);
        System.out.println(userResult);
    }
}
