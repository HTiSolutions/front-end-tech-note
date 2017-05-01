package com.htisolutions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping()
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("views/register");
        return modelAndView;
    }

}
