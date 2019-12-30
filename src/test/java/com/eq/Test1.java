//package com.eq;
//
//import com.pojo.User;
//import com.service.UserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Auther: szp
// * @Date: 2019/12/30 20:19
// * @Description: 沈泽鹏写点注释吧
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:applicationContext-mapper.xml"})
//public class Test1 {
//    @Autowired
//    private UserService userService;
//    @Test
//    public void find(){
//        List<User> a = userService.findUserByName("a");
//        System.out.println(a);
//        List<User> b=new ArrayList<>();
//        System.out.println(b);
//    }
//    @Test
//    public void updateUser(){
//        User user=new User();
//        user.setId(1L);
//        user.setNickName("你好");
//        Integer integer = userService.updateUser(user);
//        System.out.println(user);
//    }
//}
