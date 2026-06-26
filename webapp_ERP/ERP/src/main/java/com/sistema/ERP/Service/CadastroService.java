package com.sistema.ERP.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sistema.ERP.DTO.UsuarioDTO;
import com.sistema.ERP.Entity.Usuarios;

import com.sistema.ERP.Repository.UsuariosRepository;

@Service
public class CadastroService {
    
    @Autowired
    private UsuariosRepository usuarioRep;

    @Autowired
    private PasswordEncoder senhaEncoder;


    public void cadastrarUsuario(UsuarioDTO dto){
        Usuarios usuario = new Usuarios();

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setNivel(dto.getNivelAcesso());
        usuario.setSenhaHash(senhaEncoder.encode(dto.getSenhaHash()));

        usuarioRep.save(usuario);
    }
}
