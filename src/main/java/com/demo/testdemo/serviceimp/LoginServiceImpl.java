package com.demo.testdemo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.testdemo.dao.UserDao;
import com.demo.testdemo.model.UserDetailsModel;
import com.demo.testdemo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetailsModel getUserDetails(String userName,String password) {
        return userDao.getUserDetailsModel(userName,password);
    }

}
