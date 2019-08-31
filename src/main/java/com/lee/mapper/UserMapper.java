package com.lee.mapper;

import com.lee.entity.UserEntity;

import java.util.List;

/**
 * @创建人
 * @创建时间2019/8/30
 * @描述
 */
public interface UserMapper {
    List<UserEntity> getAllUser();
}
