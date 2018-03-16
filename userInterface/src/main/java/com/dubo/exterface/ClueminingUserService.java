package com.dubo.exterface;

import com.dubo.entity.ClueminingUser;

import java.util.List;

public interface ClueminingUserService {
    /**
     * 得到线上的用户数据
     * @return
     */
    public List<ClueminingUser> getAll();

    /**
     * 更新或插入用户
     * @param cluemining_user
     */
    public void insert(ClueminingUser cluemining_user);

    /**
     * 更新之前清除数据
     */
    public void deleteAll();

    /**
     * 测试
     * @return
     */
    public List<ClueminingUser> test();

}
