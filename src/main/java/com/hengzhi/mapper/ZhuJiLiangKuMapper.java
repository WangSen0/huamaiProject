package com.hengzhi.mapper;

import com.hengzhi.entity.Condition;
import com.hengzhi.entity.ZhuJiLiangKu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZhuJiLiangKuMapper {
    public List<ZhuJiLiangKu> showZhuJiLiangKuByPage(@Param("currPage")int pageNo,@Param("pageSize") int pageSize);

    public List<ZhuJiLiangKu> tiaoJianChaXun(@Param("tiaoJian") Condition condition);

//    统计总净重数
    public int tongJiJingZhong(@Param("tiaoJian") Condition condition);

//    统计总车数
    public int tongJiCheShu(@Param("tiaoJian") Condition condition);


}
