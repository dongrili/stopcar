package com.snow.stop.core.impl;

import com.snow.stop.client.UserFacadeService;
import com.snow.stop.common.model.User;
import com.snow.stop.dal.domain.UserDO;
import com.snow.stop.dal.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ldrs on 2015/6/4.
 */
@Service("userFacadeService")
public class UserFacadeServiceImpl implements UserFacadeService {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long userId) {
       if(userId==null){
           return null;
       }
       UserDO userDO = userMapper.getUserById(userId);
        if(logger!=null){
            logger.debug("收到请求："+userDO);
        }
        User user = new User();
        if(userDO!=null){
            user.setUserName(userDO.getName());
            user.setUserId(userDO.getId());
        }else {
            user.setUserId(-999L);
            user.setUserName("007:code" + "empty");
        }
        return user;
    }
}
