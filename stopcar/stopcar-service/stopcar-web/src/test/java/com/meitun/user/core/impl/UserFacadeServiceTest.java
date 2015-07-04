package com.meitun.user.core.impl;

import com.meitun.user.dal.domain.UserDO;
import com.meitun.user.dal.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ldrs on 2015/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/application-context.xml"})
public class UserFacadeServiceTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testUserService(){

        UserDO userDO = userMapper.getUserById(1L);

        System.out.println(userDO);
    }
}
