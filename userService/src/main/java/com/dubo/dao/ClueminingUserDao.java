package com.dubo.dao;

import com.dubo.entity.ClueminingUser;

import java.util.List;

public interface ClueminingUserDao {
    /**
     * 得到线上的用户数据
     * @return
     */
    public List<ClueminingUser> getAll();

    /**
     * 更新或插入用户
     * @param clueminingUser
     */
    public void insert(ClueminingUser clueminingUser);

    /**
     * 更新之前清除数据
     */
    public void deleteAll();
}
