package com.copy.newretwiscopy.mapper;

import com.copy.newretwiscopy.entity.Answer;
import com.copy.newretwiscopy.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {

    @Insert("insert into comment(uid,uname,avatar,time,content,pid) values(#{uid},#{uname},#{avatar},#{time},#{content,pid)}")
    void addComment(Comment comment);

    @Select("select * from comment where pid = #{pid} order by time desc")
    List<Comment> findCommentByPid(Integer pid);

    @Insert("insert into answer(uid,uname,avatar,content,time,comment_id values(#{uid},#{uname},#{avatar},#{content},#{time},#{comment_id})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void answer(Answer answer);

    @Select("select * from answer where comment_id = #{id} order by desc")
    List<Answer> findAnswerByCommentId(Integer id);

    @Select("select * from comment where comment_id = #{commentId}")
    Comment findByCommentId(Integer commentId);
}
