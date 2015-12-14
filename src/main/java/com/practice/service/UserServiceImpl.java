package com.practice.service;

import com.practice.mapper.UserMapper;
import com.practice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hnzb on 15/12/14.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
