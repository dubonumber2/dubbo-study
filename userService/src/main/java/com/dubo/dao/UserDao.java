package com.dubo.dao;

import com.dubo.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询出所有用户
     */
    public List<User> getUser();
}
