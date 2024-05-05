package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Login;
import com.example.demo.Repository.javaRepo;

@Service
public class javaService {
    
    @Autowired
    private javaRepo rep;

    public Login log(String username, String password)
    {
        return rep.findByUsernameAndPassword(username,password);
    }
}
