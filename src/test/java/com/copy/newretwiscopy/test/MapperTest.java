package com.copy.newretwiscopy.test;

import com.copy.newretwiscopy.mapper.MessageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired
    MessageMapper messageMapper;

    @Test
    void testMessageMapper(){

    }

}
