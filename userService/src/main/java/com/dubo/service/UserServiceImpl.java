package com.dubo.service;

import com.dubo.dao.UserDao;


import com.dubo.entity.User;
import com.dubo.exterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}
