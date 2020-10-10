package com.cib.defender.biz.service.impl;

import com.cib.defender.biz.service.UserService;
import com.cib.defender.dao.entity.User;
import com.cib.defender.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName:UserServiceImpl
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/26 3:43 PM
 * @Version:1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User saveOrUpdateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> listUser() {
        return userMapper.getAll();
    }
}
