package com.bw.qinguanghua.repsitory;


import com.bw.qinguanghua.bean.UserEntity;
import com.bw.qinguanghua.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by qin on 2017/7/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {

        UserEntity user=new UserEntity();
        user.setId(21);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
        UserEntity user= userDao.findUserByUserName("小明");
        System.out.println("user is "+user);
    }

    @Test
    public void updateUser(){
        UserEntity user=new UserEntity();
        user.setId(21);
        user.setUserName("孙行者");
        user.setPassWord("者行孙666");
        userDao.updateUser(user);
    }

//    @Test
//    public void deleteUserById(){
//        userDao.deleteUserById(1l);
//    }
}
