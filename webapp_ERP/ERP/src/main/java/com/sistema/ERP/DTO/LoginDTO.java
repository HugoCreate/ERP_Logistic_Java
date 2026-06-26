package com.sistema.ERP.DTO;

public class LoginDTO {
    private String email;
    private String senha;


    public LoginDTO(){}

    public LoginDTO(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String new_email){
        this.email = new_email;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String new_senha){
        this.senha = new_senha;
    }
}
