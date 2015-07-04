package com.snow.stop.dal.mapper;

import com.snow.stop.dal.domain.UserDO;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by ldrs on 2015/5/21.
 */
public interface UserMapper {

    public List<UserDO> getUsers(RowBounds rb);

    public UserDO getUserById(Long id);

    public int count();
}
