package com.bw.qinguanghua.repository;

import com.bw.qinguanghua.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 秦光华 on 2017/7/28.
 */
public interface UserMapper extends JpaRepository<User,String> {

    User  findByUsernameAndPassword(String username ,String password); //登录
    List<User> findAllBy();  //查询所有用户
    @Transactional
    @Query(value = "update user set username=?1,password=?2,age=?3,sex=?4,headphoto=?5,hobby=?6", nativeQuery = true)
    @Modifying
    void updateUser(String username,String password,int age,int sex,String headphoto,String hobby);//修改
}
