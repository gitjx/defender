package com.cib.defender.biz.service;

import com.cib.defender.dao.entity.User;

import java.util.List;

/**
 * @ClassName:UserService
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/7/26 3:37 PM
 * @Version:1.0
 **/
public interface UserService {
    /**
     * 新增或者修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户
     * @return
     */
    List<User> listUser();
}
