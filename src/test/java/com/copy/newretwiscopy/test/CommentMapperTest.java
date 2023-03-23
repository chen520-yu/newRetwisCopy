package com.copy.newretwiscopy.test;


import com.copy.newretwiscopy.mapper.CommentMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentMapperTest {

    @Autowired
    CommentMapper commentMapper;

}
