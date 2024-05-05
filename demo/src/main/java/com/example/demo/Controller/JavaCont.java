package com.example.demo.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Domain.Login;
import com.example.demo.Service.javaService;

@Controller
public class JavaCont {
    @Autowired
    private javaService ser;

    @GetMapping("/")
    public String log(){
        return "index";
    }
    
    @PostMapping("/log")
    public String login(@ModelAttribute("user") Login user)
    {
        Login userr = ser.log(user.getUsername(),user.getPassword());
        if(Objects.nonNull(userr))
        {
            return "redirect:/disp";
        }
        else{
            return "redirect:/";
        }
    }

    @GetMapping("/disp")
    public String display(){
        return "display";
    }

}
