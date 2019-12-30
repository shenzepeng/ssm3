package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: szp
 * @Date: 2019/12/30 20:10
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String getHello(){
        return "hello";
    }
    @PostMapping(value = "add/user",produces = "text/html;charset=utf-8")
    public String  addUser(User user){
        Integer result = userService.addUser(user);
        if (result.equals(1)){
            return "用户注册成功";
        }else {
            return "注册失败";
        }
    }

    @PostMapping(value = "update/user",produces = "text/html;charset=utf-8")
    public String updateUser(User user){
        Integer result = userService.updateUser(user);
        if (result.equals(1)){
            return "用户更新成功";
        }else {
            return "更新失败";
        }
    }

    @PostMapping(value = "delete/user",produces = "text/html;charset=utf-8")
    public String detele(User user){
        Integer result = userService.deleteUser(user.getId());
        if (result.equals(1)){
            return "用户删除成功";
        }else {
            return "删除失败";
        }
    }

    @GetMapping(value = "find/user/id")
    public String find(User user){
        User userById = userService.findUserById(user.getId());
        return userById.toString();
    }
}
