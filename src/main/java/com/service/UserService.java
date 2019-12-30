package com.service;

import com.pojo.User;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/30 20:23
 * @Description: 沈泽鹏写点注释吧
 */
public interface UserService {
    List<User> findUserByName(String nickName);
    Integer updateUser(User user);
    Integer addUser(User user);
    Integer deleteUser(Long id);
    User findUserById(Long id);
}
