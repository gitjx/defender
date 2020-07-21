package com.cib.defender.dao.mapper;

import com.cib.defender.dao.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Boolean id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Boolean id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}