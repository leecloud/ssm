package com.lee.service.impl;

import com.lee.entity.UserEntity;
import com.lee.mapper.UserMapper;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @创建人
 * @创建时间2019/8/30
 * @描述
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserEntity> getAllUser() {
        return userMapper.getAllUser();
    }
}
