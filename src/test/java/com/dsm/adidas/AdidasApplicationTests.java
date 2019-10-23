package com.dsm.adidas;

import com.dsm.adidas.entity.User;
import com.dsm.adidas.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdidasApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void  selectUser(){
        HashMap mp = new HashMap();
        System.out.println("mp = " + mp);
        List<User> userList = userService.selectAllUser(mp);
        System.out.println("userList = " + userList);
    }

}
