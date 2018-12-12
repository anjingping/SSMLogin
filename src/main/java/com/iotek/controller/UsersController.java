package com.iotek.controller;

import com.iotek.pojo.Users;
import com.iotek.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping("/login")
    public ModelAndView login(Users users){
        ModelAndView mav = new ModelAndView();
        boolean b = usersService.login(users);
        if (b){
            mav.setViewName("/WEB-INF/jsp/success.jsp");
        }else {
            mav.setViewName("index.jsp");
        }
        return mav;
    }

    @RequestMapping("/register")
    public ModelAndView register(Users users){
        ModelAndView mav = new ModelAndView();
        boolean b = usersService.register(users);
        if (b){
            mav.setViewName("index.jsp");
        }else {
            mav.setViewName("register.jsp");
        }
        return mav;
    }
}
