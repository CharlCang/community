package com.seancang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//表示可以接收前端的请求
@Controller
public class HelloController {
    @GetMapping("/hello1")
    public String hello(@RequestParam(name = "name1") String na, Model model) {
        model.addAttribute("name", na);
        return "greeting";
    }
}
