package com.lamd.provider.eventInformationPush.smsConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:publicapplication.properties")
public class SMSConfig {
    @Value("${Url}")
    private static String Url;  //互亿无线给的连接
    @Value("${account}")
    private static String account;   //查看用户名是登录用户中心->验证码短信->产品总览->APIID
    @Value("${password}")
    private static String password;   //查看密码请登录用户中心->验证码短信->产品总览->APIKEY

    public static String getUrl() {
        return Url;
    }

    public static void setUrl(String url) {
        Url = url;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
