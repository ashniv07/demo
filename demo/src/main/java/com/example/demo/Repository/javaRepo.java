package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Domain.Login;
@Repository
public interface javaRepo extends JpaRepository<Login,String>{
    Login findByUsernameAndPassword(String username, String password);
    
    
}
