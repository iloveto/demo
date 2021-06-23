package com.example.demoweb.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {

    @Autowired
    Calculate calculate;

    @RequestMapping("/aop/test")
    public void test() {
        int a = calculate.div(1, 0);
        System.out.println(a);
    }
}
