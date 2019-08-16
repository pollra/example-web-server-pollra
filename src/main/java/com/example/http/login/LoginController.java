package com.example.http.login;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/loginasdf")
public class LoginController {

    @PostMapping
    public String qsfdasdfqsadflogin(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        return "OK";
    }
}
