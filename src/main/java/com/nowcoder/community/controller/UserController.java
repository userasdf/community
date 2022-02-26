package com.nowcoder.community.controller;

import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test()
    {
        return "hello spring boot";
    }

    @RequestMapping("/student")
    @ResponseBody
    public String student(String name,String age){
        return name+","+age;
    }

    //老师页面
    @RequestMapping("/teacher")
    public String teacher(Model model)
    {
        model.addAttribute("name","小明");
        model.addAttribute("age","34");
        return "demo/teacher";
    }

    @RequestMapping("/emp")
    @ResponseBody
    public Map<String,Object> emp()
    {
        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age","23");
        return map;
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<User> selectAll()
    {
        return userService.findAll();
    }
}
