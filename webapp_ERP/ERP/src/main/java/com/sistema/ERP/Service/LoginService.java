package com.sistema.ERP.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sistema.ERP.DTO.LoginDTO;
import com.sistema.ERP.Entity.Usuarios;
import com.sistema.ERP.Repository.UsuariosRepository;

@Service
public class LoginService {
    
    @Autowired
    private UsuariosRepository usuarioRepo;

    private PasswordEncoder encoder;

    public Usuarios LoginConta(LoginDTO dto){
        

        /*Optional é utilizado para previnir o erro de NullPointerEcxception
        que surge quando tentamos buscar um usuario no banco de dados e ele não
        existe. Ao invés de dar erro no programa o "Optional" armazena ou um usuário 
        existente ou um valor nulo. Se o dado interno for Null ele lança o RuntimeException
        de email ou senha inválidos. Se não, nós pegamos o objeto que o Repo achou (usuario)
        e colocamos na variável usuario    */
        Optional<Usuarios> usuarioOpt = usuarioRepo.findByEmail(dto.getEmail());

        if(usuarioOpt.isEmpty()){
            throw new RuntimeException("Email ou senha inválidos.");
        }

        Usuarios usuario = usuarioOpt.get();

        boolean senhaValida = encoder.matches(
            dto.getSenha(), usuario.getSenhaHash());

        if(!senhaValida){
            throw new RuntimeException("Email ou Senha inválida.");
        }
        
        return usuario;
    }
}
