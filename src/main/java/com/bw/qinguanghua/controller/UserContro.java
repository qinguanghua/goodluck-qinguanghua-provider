package com.bw.qinguanghua.controller;

import com.bw.qinguanghua.bean.User;
import com.bw.qinguanghua.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 秦光华 on 2017/7/28.
 */
@Controller
public class UserContro {
    @RequestMapping("/enter")//进入登录界面
    public String enter(){
        return "login";
    }
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/login")//登录
    public String login(User user){
        User u = userMapper.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        if(u!=null){
            return "success";
        }else{
            return "register";
        }
    }
    @RequestMapping("/register")//注册
    @ResponseBody
    public String register(User user){
        User u = userMapper.save(user);
       return "success";
    }
    @RequestMapping("/update")//修改用户信息
    public String update(User user){
        userMapper.updateUser(user.getUsername(),user.getPassword(),user.getAge(),user.getSex(),user.getHeadphoto(),user.getHobby());
        return "success";
    }
    @RequestMapping("/register")//删除用户信息
    @ResponseBody
    public String delete(User user){
        userMapper.delete(user);
        return "main";
    }
    @RequestMapping("/register")//显示多有用户
    public String findAll(Model model){
        List<User> list = userMapper.findAllBy();
        model.addAttribute("users",list);
        return "main";
    }

}
