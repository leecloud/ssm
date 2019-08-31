package com.lee.service;

import com.lee.entity.UserEntity;
import com.lee.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @创建人
 * @创建时间2019/8/30
 * @描述
 */
public interface UserService {
    List<UserEntity> getAllUser();
}
