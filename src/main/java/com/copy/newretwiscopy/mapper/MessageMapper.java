package com.copy.newretwiscopy.mapper;

import com.copy.newretwiscopy.entity.Message;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageMapper {

    @Insert("insert into message(to_id,message,time,type_id) values(#{to_id},#{message},#{time},#{type_id})")
    void addMessage(Message message);

    @Select("select count(*) from message where to_id = #{uid} and status = 1")
    Integer messageCount(Integer uid);

    @Select("select *, #{uid} as uid from msg_type")
    @Results(value = {
            @Result(property = "id", column = "id",id = true),
            @Result(property = "name", column = "name"),
            @Result(property = "value", column = "{id = id, uid = uid}", one = @One(select = "com.copy.newretwiscopy.mapper.MessageMapper.findTypeNum"))
    })
    List<Message> findMessageTypeNum(@Param("uid") Integer uid);

    @Select("select count(*) from message where type_id = #{id} and to_id = #{uid} and status = 1")
    Integer findTypeNum(@Param("id") Integer id, @Param("uid") Integer uid);


}
