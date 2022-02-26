package com.nowcoder.community.service.impl;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.mapper.DiscussPostMapper;
import com.nowcoder.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DiscussPostServiceImpl implements DiscussPostService{

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Override
    public List<DiscussPost> getDiscussPostById(int userId, int start, int limit) {
        return discussPostMapper.getDiscussPostById(userId,start,limit);
    }

    @Override
    public int getDiscussRows(int userId) {
        return discussPostMapper.getDiscussPostRows(userId);
    }
}
