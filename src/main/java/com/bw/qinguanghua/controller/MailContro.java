package com.bw.qinguanghua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qin on 2017/7/15.
 */
@RestController
public class MailContro {
    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping("mail")
    public String sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("m15201401700@163.com");
        message.setTo("164548218@qq.com");
        message.setSubject("主题：秦光华");
        message.setText("皇上万岁万岁万万岁");
        mailSender.send(message);
        return "success";
    }

}
