package com.dubo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubo.dao.ClueminingUserDao;
import com.dubo.entity.ClueminingUser;
import com.dubo.exterface.ClueminingUserService;
import com.dubo.utils.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClueminingUserServiceImpl implements ClueminingUserService {

    @Autowired
    private ClueminingUserDao clueminingUserDao;

    public void setClueminingUserDao(ClueminingUserDao clueminingUserDao) {
        this.clueminingUserDao = clueminingUserDao;
    }

    @Override
    @DataSource("dataSource1")
    public List<ClueminingUser> getAll() {
        return clueminingUserDao.getAll();
    }

    @Override
    @DataSource("dataSource")
    public void insert(ClueminingUser clueminingUser) {
        clueminingUserDao.insert(clueminingUser);
    }

    @Override
    @DataSource("dataSource")
    public void deleteAll() {
        clueminingUserDao.deleteAll();
    }

}
