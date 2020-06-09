package com.devin.service;

import com.devin.entity.User;

import java.util.List;

/**
 * @Author: Devin
 * @Date: 2020/6/9 18:45
 */
public interface UserService {
    void save(User user);

    List<User> selectAll();
}
