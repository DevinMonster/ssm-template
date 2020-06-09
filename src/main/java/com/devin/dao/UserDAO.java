package com.devin.dao;

import com.devin.entity.User;

import java.util.List;

/**
 * @Author: Devin
 * @Date: 2020/6/9 18:33
 */
public interface UserDAO {
    /**
     * 保存用户到数据库
     *
     * @param user 用户对象
     */
    void save(User user);

    /**
     * 查询数据库中所有的用户
     *
     * @return 用户列表
     */
    List<User> selectAll();
}
