package com.nowcoder.community.mapper;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    //获取所有用户
    public List<User> getAllUsers();


    //根据用户id查询用户
    @Select("select * from user where id=#{userId}")
    public User getUserById(int userId);
}
