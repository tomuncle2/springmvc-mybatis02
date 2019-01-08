package com.itheima.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: TestTokenController
 * @author 蔡迪
 * @date 2018年12月6日下午4:46:37
 * @Description: TODO(jwt实现token的签名和认证)
 */
@Controller
class TestTokenController {

    public TestTokenController() {
        // TODO Auto-generated constructor stub
    }
    
    //认证签名
    @RequestMapping(value="/testToken",method= RequestMethod.GET)
    public String getToken(){
        
        
        return "";
    }

    
    //检验token
}
