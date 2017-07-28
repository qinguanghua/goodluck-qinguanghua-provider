package com.bw.qinguanghua.controller;


import com.bw.qinguanghua.bean.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qin on 2017/7/21.
 * 全局异常返回error界面
 */
@Controller
public class ExceptionContro {
    @RequestMapping(value="/helloe", method = RequestMethod.GET)
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }
    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

}
