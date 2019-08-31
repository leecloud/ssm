package com.lee.controller;

import com.lee.entity.UserEntity;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人
 * @创建时间2019/8/30
 * @描述
 */
@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/all",method = RequestMethod.GET)
    public List<UserEntity> getAll(){
        return userService.getAllUser();
    }
}
