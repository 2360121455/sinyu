package cn.sinyu.energy.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/index.html")
    public String index(){
        return "index";
    }

    @GetMapping("/login.html")
    public String login(){
        return "login";
    }

    @GetMapping("/register.html")
    public String register(){
        return "register";
    }

    @GetMapping("product-list1_1.html")
    public String electricity1(String id,String name, Model model){
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        return "gether/product-list1_1";
    }

    @GetMapping("product-list1_2.html")
    public String electricity2(String id,String name, Model model){
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        return "gether/product-list1_2";
    }
}
