package com.devin.controller;

import com.devin.entity.User;
import com.devin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: Devin
 * @Date: 2020/6/9 22:26
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有
     */
    @RequestMapping("selectAll")
    public String selectAll(HttpServletRequest request) {
        List<User> users = userService.selectAll();
        request.setAttribute("users", users);
        return "selectAll";
    }

    /**
     * 插入一个用户
     */
    @RequestMapping("insertUser")
    public String insertUser(User user, HttpServletRequest request) {
        // 1. 收集数据 2. 调用业务方法 3. 跳转到指定位置
        try {
            System.out.println("user = " + user);
            userService.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/insertUser.jsp";
        }
        request.setAttribute("user", user);
        return "redirect:/user/selectAll";
    }
}
