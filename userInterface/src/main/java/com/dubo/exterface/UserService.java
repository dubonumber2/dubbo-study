package com.dubo.exterface;

import com.dubo.entity.User;

import java.io.Serializable;
import java.util.List;

public interface UserService {
    /**
     * 查询用户
     * @return
     */
    public List<User> getUser(int pageSize,int page);

    /**
     * 得到分页的总数
     * @return
     */
    public int getTotal();
}
