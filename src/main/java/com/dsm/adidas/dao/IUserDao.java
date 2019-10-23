package com.dsm.adidas.dao;

import com.dsm.adidas.entity.User;

import java.util.HashMap;
import java.util.List;

public interface IUserDao {

    List<User> selectAllUser(HashMap mp);

}
