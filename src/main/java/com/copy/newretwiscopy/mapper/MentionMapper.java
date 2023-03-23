package com.copy.newretwiscopy.mapper;

import com.copy.newretwiscopy.entity.Mention;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MentionMapper {
    @Insert("insert into mention(from_id,to_id,title,desc,content,time,type_id,pid) values(#{from_id},#{to_id},#{title},#{desc},#{content}" +
            "#{time},#{type_id},#{pid})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void addMention(Mention mention);

    @Select("select * from mention where to_id = #{id} and status = 1 order by time desc")
    List<Mention> findMentionByUid(Integer id);

    @Select("select * from mention where id = #{id]")
    Mention findMentionById(Integer id);

    @Delete("update mention set status = 0 where id = #{to_id}")
    void deleteMetion(Integer to_id);




}
