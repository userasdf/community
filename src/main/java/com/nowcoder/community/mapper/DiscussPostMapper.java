package com.nowcoder.community.mapper;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {

    public List<DiscussPost> getDiscussPostById(@Param("userId") int userId,
                                                @Param("start") int start,
                                                @Param("limit") int limit);

    public int getDiscussPostRows(@Param("userId") int userId);
}
