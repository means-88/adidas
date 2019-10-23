package com.dsm.adidas.service.impl;

import com.dsm.adidas.dao.IUserDao;
import com.dsm.adidas.entity.User;
import com.dsm.adidas.service.IUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Transactional
@MapperScan(basePackages = "com.dsm.adidas.dao")
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> selectAllUser(HashMap mp) {
        return userDao.selectAllUser(mp);
    }

}
