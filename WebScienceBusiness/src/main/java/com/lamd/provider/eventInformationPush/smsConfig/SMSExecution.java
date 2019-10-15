package com.lamd.provider.eventInformationPush.smsConfig;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

import java.io.IOException;

@Configuration
public class SMSExecution {
    @Autowired
    private SMSConfig smsConfig;

    HttpClient client = new HttpClient();
    PostMethod method = new PostMethod(SMSConfig.getUrl());

    public void SMSMethod(String phone,String sendMessage) {
        client.getParams().setContentCharset("UTF-8");
        method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

        int mobile_code = (int)((Math.random()*9+1)*100000);

        String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");
        System.out.println(content);
        NameValuePair[] data = {//提交短信
                new NameValuePair("account",smsConfig.getAccount()), //查看用户名是登录用户中心->验证码短信->产品总览->APIID
                new NameValuePair("password",smsConfig.getPassword()),  //查看密码请登录用户中心->验证码短信->产品总览->APIKEY
                //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
                new NameValuePair("mobile",phone),
                new NameValuePair("content", content),  //content 换为 sendMessage
        };
        method.setRequestBody(data);

        try {
            client.executeMethod(method);

            String SubmitResult =method.getResponseBodyAsString();

            //System.out.println(SubmitResult);

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            String code = root.elementText("code");
            String msg = root.elementText("msg");
            String smsid = root.elementText("smsid");

            System.out.println(code);
            System.out.println(msg);
            System.out.println(smsid);

            if("2".equals(code)){
                System.out.println("短信提交成功");
            }

        } catch (
                HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            // Release connection
            method.releaseConnection();
            //client.getConnectionManager().shutdown();
        }
    }


}
