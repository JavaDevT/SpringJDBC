package com.demo.testdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.testdemo.model.UserDetailsModel;
import com.demo.testdemo.service.LoginService;
import com.google.gson.Gson;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/userlogin")
    public ModelAndView userLogin(@RequestParam String userName,
            @RequestParam String password) {
        ModelAndView modelAndView = new ModelAndView();
        UserDetailsModel detailsModel = loginService.getUserDetails(userName, password);
        if (detailsModel != null) {
            modelAndView.setViewName("welcome");
            modelAndView.addObject("user", detailsModel);
            return modelAndView;
        }
        modelAndView.setViewName("login");
        modelAndView.addObject("user", detailsModel);
        return modelAndView;
    }

    @GetMapping("/login")
    public String index() {
        return "login";
    }
}
