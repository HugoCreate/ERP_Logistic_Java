package com.sistema.ERP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.ERP.Service.LoginService;
import com.sistema.ERP.DTO.LoginDTO;

@Controller
@RequestMapping("/api/login")
public class LoginController {
    
    @Autowired
    private LoginService login_service;

    @GetMapping
    public String loginPage(){
        return "login";
    }

    @PostMapping
    public ResponseEntity<?> loginRequest(@RequestBody LoginDTO
        loginDto
    ){
        login_service.LoginConta(loginDto);
        
        return ResponseEntity.ok("Login realizado com sucesso.");
    }
}
