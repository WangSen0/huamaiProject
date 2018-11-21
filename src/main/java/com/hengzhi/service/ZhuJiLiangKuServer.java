package com.hengzhi.service;

import com.hengzhi.entity.Condition;
import com.hengzhi.entity.ZhuJiLiangKu;
import com.hengzhi.mapper.ZhuJiLiangKuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ZhuJiLiangKuServer {
    int pageSize=10;
    @Autowired
    ZhuJiLiangKuMapper zhuJiLiangKuMapper;

    //   Service层显示主计量库总表
    public List<ZhuJiLiangKu> showZhuJiLiangKuByPage(int pageNo){

        return zhuJiLiangKuMapper.showZhuJiLiangKuByPage((pageNo-1)*pageSize,pageSize);//直接在list中截取
    }

    //   Service层条件查询
    public List<ZhuJiLiangKu> tiaoJianChaXun(Condition condition){
        return  zhuJiLiangKuMapper.tiaoJianChaXun(condition);
    }

    //    Service层统计车数
    public int tongJiCheShu(Condition condition){
        return zhuJiLiangKuMapper.tongJiCheShu(condition);
    }

    //    Service层统计总净重数
    public int tongJiJingZhong(Condition condition){
        return zhuJiLiangKuMapper.tongJiJingZhong(condition);
    }



}
