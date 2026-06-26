package com.sistema.ERP.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.sistema.ERP.Enums.NivelAcessoEnum;;

@Entity
@Table(name = "USUARIOS")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nome;
    private NivelAcessoEnum NivelAcesso;
    private String email;
    private String senha_hash;

    public Long getIdUsuario(){
        return this.id_usuario;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String new_nome){
        this.nome = new_nome;
    }

    public NivelAcessoEnum getNivel(){
        return this.NivelAcesso;
    }
    public void setNivel(NivelAcessoEnum new_nivel){
        this.NivelAcesso = new_nivel;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String new_email){
        this.email = new_email;
    }

    public String getSenhaHash(){
        return this.senha_hash;
    }
    public void setSenhaHash(String new_senhaHash){
        this.senha_hash = new_senhaHash;
    }

}
