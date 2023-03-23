package com.copy.newretwiscopy.mapper;

import com.copy.newretwiscopy.entity.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface EditPostMapper {

    @Insert("insert into edit_post values(#{id},#{content})")
    void addPost(@Param("id") Integer id, @Param("content") String content);

    @Select("select * from edit_post where id=#{id}")
    String findContentById(Integer id);

    @Update("update edit_post set content = #{content} where id = #{id}")
    void update(@Param("id") Integer id,@Param("id") String content);

}
