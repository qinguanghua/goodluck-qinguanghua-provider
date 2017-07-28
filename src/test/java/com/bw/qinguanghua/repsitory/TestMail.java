package com.bw.qinguanghua.repsitory;

import com.bw.qinguanghua.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by qin on 2017/7/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMail{
    @Autowired
    private MailService mailService;

    @Test()
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("jiaozhiguang@126.com","qinguanghua"," wansui");
    }
}
