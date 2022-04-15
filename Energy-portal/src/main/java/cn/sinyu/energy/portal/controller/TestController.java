package cn.sinyu.energy.portal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping("/delete")
    public String delete(){
        return "test >> delete";
    }
    @GetMapping("/add")
    public String add(){
        return "test >> add";
    }
    @GetMapping("/update")
    public String update(){
        return "test >> update";
    }
    @GetMapping("/query")
    public String query(){
        return "test >> query";
    }

}
