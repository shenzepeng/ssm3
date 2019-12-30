package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/30 20:24
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class UserServceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUserByName(String nickName) {
        return userDao.findUserByNickName(nickName);
    }

    @Override
    public Integer updateUser(User user) {
        user.setUpdateTime(new Date());
        System.out.println(user);
        return userDao.updateUser(user);
    }

    @Override
    public Integer addUser(User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return userDao.addUser(user);
    }

    @Override
    public Integer deleteUser(Long id) {
        return userDao.deleteUSerById(id);
    }

    @Override
    public User findUserById(Long id) {
        return userDao.findUserBById(id);
    }

}
