package com.hengzhi.service;

import com.hengzhi.entity.User;
import com.hengzhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/11/20.
 */
@Service
@Transactional
public class UserServer {
    @Autowired
    UserMapper userMapper;
    public User findUser(User user){
        return userMapper.findUser(user);
    }
}
