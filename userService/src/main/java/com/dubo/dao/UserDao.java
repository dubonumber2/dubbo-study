package com.dubo.dao;

import com.dubo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     * 查询出所有用户
     */
    public List<User> getUser(@Param("pageSize")int pageSize,@Param("page")int page);

    /**
     * 得到分页的总条数
     * @return
     */
    public int getTotal();
}
