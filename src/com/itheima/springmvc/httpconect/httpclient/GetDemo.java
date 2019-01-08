package com.itheima.springmvc.httpconect.httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
/**
 * @ClassName: GetDemo
 * @author 蔡迪
 * @date 2018年12月6日上午12:05:44
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

public class GetDemo {

    public static void main(String[] args) {
        // 1. 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 2. 创建HttpGet对象
        String ipAndPort = "http://120.79.117.120:9999/api/v3/areas";
        String area ="%E8%81%94%E5%8D%95%E5%86%85%E6%B5%8B%E5%B9%B3%E5%8F%B0";
        String endstr = "adminAreas";
        String token ="access_token=Rd5AjsNyy86xnFbMdHxJfwaYg8nXakj3oFRo4tQUXEyrhL6Ml4QHEQViJCHlVtV";
        StringBuffer urlBuffer = new StringBuffer();
        urlBuffer.append(ipAndPort);urlBuffer.append("/"+area);urlBuffer.append("/"+endstr);
        urlBuffer.append("?"+token);
        HttpGet httpGet = new HttpGet(urlBuffer.toString());
        
        
       
        
        CloseableHttpResponse response = null; 
        try {
            // 3. 执行GET请求
            response = httpClient.execute(httpGet);
            System.out.println(response.getStatusLine());
            // 4. 获取响应实体
            HttpEntity entity = response.getEntity();
            // 5. 处理响应实体
            if (entity != null) {
                System.out.println("长度：" + entity.getContentLength());
                System.out.println("内容：" + EntityUtils.toString(entity));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6. 释放资源
            try {
                response.close();
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
