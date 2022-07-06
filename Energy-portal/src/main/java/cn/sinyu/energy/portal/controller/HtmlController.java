package cn.sinyu.energy.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * thymeleaf框架的控制器，这里面return的页面都在templates中
 */
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

    /**
     * 如果直接用ajax传数据，会出现浏览器跨域攻击的问题，所以需要使用model来传输数据
     * @param id location_code
     * @param name 节点名称
     * @param model
     * @return
     */
    @GetMapping("product-list1_1.html")
    public String electricity1(String id,String name,String code, Model model){
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        model.addAttribute("code",code);
        return "gether/product-list1_1";
    }

    @GetMapping("product-list1_2.html")
    public String electricity2(String id,String name,String code, Model model){
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        model.addAttribute("code",code);
        return "gether/product-list1_2";
    }
}
