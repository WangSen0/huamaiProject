package com.hengzhi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hengzhi.entity.Condition;
import com.hengzhi.entity.ZhuJiLiangKu;
import com.hengzhi.service.ZhuJiLiangKuServer;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
@RequestMapping(value = "showZhuJiLiangKu")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ZhuJiLiangKuController {
    @Autowired
    ZhuJiLiangKuServer zhuJiLiangKuServer;

    @RequestMapping(value = "main/{pageNo}",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String showZhuJiLiangKu(Model model,@PathVariable("pageNo") int pageNo) throws Exception {
        int flag;
        List<ZhuJiLiangKu> list;
        JSONArray jsonArray;
        JSONObject jsonObject = new JSONObject();
        try {
            list = zhuJiLiangKuServer.showZhuJiLiangKuByPage(pageNo);
            jsonArray=JSONArray.fromObject(list);
            jsonObject.put("data", jsonArray);
            jsonObject.put("code", 1);
        } catch (Exception se) {
            se.printStackTrace();
            jsonObject.put("code", 0);
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "souSuo",produces = "application/json; charset=utf-8")
    public String TiaoJianChaXun(Model model) {
        return "TiaoJianChaXun";
    }

//统计总车数与总净重数
    @RequestMapping(value = "tongji",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String tongji(Model model, Condition condition) throws Exception{
        JSONObject json=new JSONObject();
        try{
            int total_cars=zhuJiLiangKuServer.tongJiCheShu(condition);
            int total_jingzhong=zhuJiLiangKuServer.tongJiJingZhong(condition);
            json.put("total_cars",total_cars);
            json.put("total_jingzhong",total_jingzhong);
            json.put("code",1);
        }
        catch (Exception se){
            json.put("code",0);
        }
        return json.toString();
    }


    @ResponseBody
    @RequestMapping(value="ccc")
    public Condition ajaxRequest(Condition condition){
        System.out.println(condition);
        return condition;
    }



    @RequestMapping(value = "result", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @ResponseBody
    public String chaXunJieGuo(Model model,Condition condition) throws Exception{

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.print(condition);
        System.out.print("----------------------------分割线--------------------------------------");
        condition = (Condition) objectMapper.readValue(String.valueOf(condition), Condition.class);
        System.out.print(condition);

        List<ZhuJiLiangKu> list;
        JSONObject jsonObject;
        JSONArray jsonArray;
        try{
            list=zhuJiLiangKuServer.tiaoJianChaXun(condition);
            jsonArray=JSONArray.fromObject(list);
            jsonObject=new JSONObject();
            jsonObject.put("data",jsonArray);
            jsonObject.put("code",1);
        }
        catch (Exception se){
            jsonObject=new JSONObject();
            jsonObject.put("code",0);
        }
        return jsonObject.toString();
    }

//    @RequestMapping("requestJson")
//    @ResponseBody
//    public List<ZhuJiLiangKu> getJson(Condition condition) throws Exception{
//        List<ZhuJiLiangKu> lists = zhuJiLiangKuServer.tiaoJianChaXun(condition);
//        return lists;
//    }

}
