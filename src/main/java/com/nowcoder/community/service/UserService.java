package com.nowcoder.community.service;

import com.nowcoder.community.entity.User;

import java.util.List;

public interface UserService {
    //查询所有用户
    public List<User> findAll();

    //根据用户id查询用户
    public User findUserById(int id);
}
