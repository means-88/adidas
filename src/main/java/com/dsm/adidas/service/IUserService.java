package com.dsm.adidas.service;

import com.dsm.adidas.entity.User;

import java.util.HashMap;
import java.util.List;

public interface IUserService {
    List<User> selectAllUser(HashMap mp);
}
