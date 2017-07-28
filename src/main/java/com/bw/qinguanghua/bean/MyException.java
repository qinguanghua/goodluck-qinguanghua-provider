package com.bw.qinguanghua.bean;

/**
 * Created by qin on 2017/7/21.
 * 创建一个自定义异常，用来实验捕获该异常，并返回json
 */
public class MyException extends Exception{
        public MyException(String message) {
            super(message);
        }
}
