package com.ecommerce.E_commerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

interface Item {
    String title = null;
    String description = null;
}

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model){
        List<Item> items = new ArrayList<Item>();

        Item item1 = new Item(){
            String title = "Item 1";
            String description = "Description 1";
        };

        Item item2 = new Item(){
            String title = "Item 2";
            String description = "Description 2";
        };

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