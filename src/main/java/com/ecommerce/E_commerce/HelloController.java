package com.ecommerce.E_commerce;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}