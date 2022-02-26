package com.nowcoder.community.service;

import com.nowcoder.community.entity.DiscussPost;

import java.util.List;

public interface DiscussPostService {

    public List<DiscussPost> getDiscussPostById(int userId,int start,int limit);

    public int getDiscussRows(int userId);

}
