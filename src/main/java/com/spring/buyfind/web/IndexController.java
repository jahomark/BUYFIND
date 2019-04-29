package com.spring.buyfind.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author MAI JIAHAO
 * @Date 2019/4/29 11:38
 * @Version 1.0
 */
@Controller
public class IndexController {
    private  static final String INDEX = "index";
    @RequestMapping("/show")
    public String getIndex(){
        return INDEX;
    }
}
