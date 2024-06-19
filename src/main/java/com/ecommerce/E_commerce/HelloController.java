package com.ecommerce.E_commerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model){
        List<Object> items = new ArrayList<Object>();

        HashMap item1 = new HashMap();
        item1.put("title", "Item 1");
        item1.put("description", "Description 1");

        HashMap item2 = new HashMap();
        item2.put("title", "Item 2");
        item2.put("description", "Description 2");

        items.add(item1);
        items.add(item2);
        System.out.print(items);
        
        model.addAttribute("items", items);

        return "index";
    }

    @RequestMapping("/category")
    public String category(){
        return "category";
    }
}