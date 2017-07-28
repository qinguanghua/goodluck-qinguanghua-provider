package com.bw.qinguanghua.service;

/**
 * Created by qin on 2017/7/15.
 */
public interface MailService {
    void sendSimpleMail(String to, String subject, String content);
}
