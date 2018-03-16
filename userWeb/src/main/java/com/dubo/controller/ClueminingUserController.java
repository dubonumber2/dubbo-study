package com.dubo.controller;

import com.dubo.entity.ClueminingUser;
import com.dubo.exterface.ClueminingUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/cluemining")
public class ClueminingUserController {
    @Autowired
    private ClueminingUserService clueminingUserService;

    private static  final Logger logger = LoggerFactory.getLogger(ClueminingUserController.class);

    public void setClueminingUserService(ClueminingUserService clueminingUserService) {
        this.clueminingUserService = clueminingUserService;
    }

    /**
     * 每天凌晨同步线下线索挖掘用户表
     */
    @Scheduled(cron = "0 0 0 * * ?")
    @RequestMapping("/userData.do")
    public void updateClueminingUser(){
        logger.info("【开始更新】msg={}","开始更新线下用户数据");
        //先清空线下线索挖掘用户表
        clueminingUserService.deleteAll();
        //获取线上用户的数据
        List<ClueminingUser> list=clueminingUserService.getAll();
        //插入线下数据库
        for(ClueminingUser one:list){
            clueminingUserService.insert(one);
        }

        logger.info("【更新完成】msg={}","线下用户数据更新完成");

    }
}
