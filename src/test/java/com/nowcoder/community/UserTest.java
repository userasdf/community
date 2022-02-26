package com.nowcoder.community;

import com.nowcoder.community.entity.User;
import com.nowcoder.community.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test()
    {
        User user = userMapper.getUserById(111);
        System.out.println(user);
    }


}
