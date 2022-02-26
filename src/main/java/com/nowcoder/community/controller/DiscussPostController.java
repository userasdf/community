package com.nowcoder.community.controller;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.Page;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.DiscussPostService;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/discussPost")
public class DiscussPostController {

    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @RequestMapping("/getDiscussPost")
    public String getDiscussPost(Model model, Page page)
    {
        page.setRows(discussPostService.getDiscussRows(0));

        //获取所有的帖子
        List<DiscussPost> discussPosts = discussPostService.getDiscussPostById(0, page.getOffset(), page.getLimit());
        List<Map<String,Object>> list = new ArrayList<>();
        if(discussPosts!=null)//如果帖子集合不为空
        {
            for (DiscussPost discussPost : discussPosts) {//遍历所有帖子
                Map<String,Object> map = new HashMap<>();
                User user = userService.findUserById(discussPost.getUserId());
                map.put("user",user);
                map.put("post",discussPost);
                list.add(map);
            }
        }
        model.addAttribute("list",list);
        return "index";
    }

}
