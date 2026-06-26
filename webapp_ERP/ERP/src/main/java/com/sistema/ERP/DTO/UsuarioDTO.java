package com.sistema.ERP.DTO;
import com.sistema.ERP.Enums.NivelAcessoEnum;;

public class UsuarioDTO {
    private String nome;
    private NivelAcessoEnum nivel_acesso;
    private String email;
    private String senha_hash;

    public UsuarioDTO(){}

    public UsuarioDTO(String nome, NivelAcessoEnum nivel_acesso, String email, String senha_hash){
        this.nome = nome;
        this.nivel_acesso = nivel_acesso;
        this.email = email;
        this.senha_hash = senha_hash;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public NivelAcessoEnum getNivelAcesso(){
        return this.nivel_acesso;
    }
    public void setNivelAcesso(NivelAcessoEnum nivel){
        this.nivel_acesso = nivel;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenhaHash(){
        return this.senha_hash;
    }
    public void setSenhaHash(String senha){
        this.senha_hash = senha;
    }

}
