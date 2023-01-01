package com.demo.testdemo.dao;

import org.springframework.stereotype.Component;

import com.demo.testdemo.model.UserDetailsModel;

@Component
public interface UserDao {
    UserDetailsModel getUserDetailsModel(String userName,String password);
}
