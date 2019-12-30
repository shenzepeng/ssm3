package com.dao;

import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/30 20:24
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUserByNickName(String nickName){
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andNickNameLike("%"+nickName+"%");
        return userMapper.selectByExample(userExample);
    }
    public Integer updateUser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public Integer addUser(User user){
        return userMapper.insert(user);
    }

    public Integer deleteUSerById(Long id){
        return userMapper.deleteByPrimaryKey(id);
    }

    public User findUserBById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
