package com.demo.testdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.testdemo.service.LoginService;
import com.google.gson.Gson;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    @ResponseBody
    public String userLogin() {
        return "login";
    }

    @PostMapping("/userlogin")
    @ResponseBody
    public String userLogin(@RequestParam String userName, @RequestParam String password) {
        String dat = new Gson().toJson(loginService.getUserDetails(userName, password));
        return dat;
    }

}
