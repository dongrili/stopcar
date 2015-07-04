package com.snow.stop.client;

import com.snow.stop.common.model.User;

/**
 * user facade service
 * Created by ldrs on 2015/6/4.
 */
public interface UserFacadeService {

    /**
     * get user by userID
     * @param userId
     * @return
     */
    public User getUserById(Long userId);
}
