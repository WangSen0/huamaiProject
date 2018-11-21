package com.hengzhi.controller;

import com.hengzhi.entity.User;
import com.hengzhi.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/11/20.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserServer userServer;
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginGet (){
        return "log_in";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPost (User user, String remember, HttpSession session, RedirectAttributes redirectAttributes){
        User userResult = userServer.findUser(user);
        if(userResult == null){
            redirectAttributes.addFlashAttribute("message","用户名密码错误");
            return "redirect:/user/login";
        }
        session.setAttribute("user", user);
        return "redirect:/showZhuJiLiangKu/main";
    }
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout (HttpSession session, RedirectAttributes redirectAttributes){
        session.removeAttribute("user");
        redirectAttributes.addFlashAttribute("message", "注销成功");
        return "redirect:/user/login";
    }
}
