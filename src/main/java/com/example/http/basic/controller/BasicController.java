package com.example.http.basic.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;

@Controller
@Component
public class BasicController {
    public BasicController() {
    }

    @GetMapping("/")
    public ModelAndView getBasic(){
        ModelAndView view = new ModelAndView("index");
        return view;
    }

    @PostMapping("/login")
    public ModelAndView postBasic(HttpServletRequest request){
        ModelAndView view = new ModelAndView("index");
        System.out.println("id:"+request.getAttribute("id"));
        return view;
    }
}