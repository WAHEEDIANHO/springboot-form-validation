package com.waheedianho.springbootvalidation.controller;

import com.waheedianho.springbootvalidation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping("add")
    public String toAdd(User user) {
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result) {
        System.out.println(result.hasErrors());
        if (!result.hasErrors()) {
            return "add";
        }
        else {
            System.out.println("save user " + user);
            return "success";
        }
    }
}
