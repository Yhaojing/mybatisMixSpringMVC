import com.practice.model.User;
import com.practice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by hnzb on 15/12/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationConfig.xml")
@ActiveProfiles(value = "development")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAllUser() {
        List<User> list = userService.selectAll();
        for (User user: list) {
            System.out.println(user.getName());
        }
    }

}
