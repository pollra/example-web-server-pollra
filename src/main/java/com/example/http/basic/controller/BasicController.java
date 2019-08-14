package com.example.http.basic.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
@Component
public class BasicController {
    public BasicController() {
    }

    @GetMapping("/index")
    public ModelAndView getBasic(){
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}