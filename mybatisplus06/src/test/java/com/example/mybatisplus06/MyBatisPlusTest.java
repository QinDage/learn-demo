package com.example.mybatisplus06;

import com.example.mybatisplus06.mapper.UserMapper;
import com.example.mybatisplus06.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        //通过条件构造器查询一个List集合，若没有条件，则可以设置null为参数
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
