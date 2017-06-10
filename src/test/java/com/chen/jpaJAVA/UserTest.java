package com.chen.jpaJAVA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chen.Application;
import com.chen.entity.UserEntity;
import com.chen.reponsitory.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveTest() {
    	
    	UserEntity userEntity = userRepository.findOne(1l);
    	System.err.println(userEntity.getName()+" : "+userEntity.getMoblie());
    	
    }
}