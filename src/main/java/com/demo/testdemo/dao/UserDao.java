package com.demo.testdemo.dao;

import com.demo.testdemo.model.UserDetailsModel;

public interface UserDao {
    UserDetailsModel getUserDetailsModel(String userName,String password);
}
