package com.demo.testdemo.service;

import org.springframework.stereotype.Component;

import com.demo.testdemo.model.UserDetailsModel;

@Component
public interface LoginService {
 
    UserDetailsModel getUserDetails(String userName,String password);
}
