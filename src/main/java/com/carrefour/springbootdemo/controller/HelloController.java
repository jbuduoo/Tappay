package com.carrefour.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 所有方法都回傳數據給瀏覽器，如果回傳是Object則轉換為JSON
@ResponseBody
@Controller
public class HelloController {

    @RequestMapping(value="/hello")
    public String hello() {

        return "Hello 可以連哦!";
    }

}
