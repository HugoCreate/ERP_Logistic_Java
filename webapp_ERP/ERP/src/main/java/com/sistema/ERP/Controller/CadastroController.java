package com.sistema.ERP.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sistema.ERP.Service.CadastroService;
import com.sistema.ERP.DTO.UsuarioDTO;

@Controller
@RequestMapping("/api/cadastro")
public class CadastroController {
    
    @Autowired
    private CadastroService cadastroServico;

    @PostMapping
    public ResponseEntity<?> cadastrarUsuarioDTO(
        @RequestBody UsuarioDTO usuarioDTO
    ){
        cadastroServico.cadastrarUsuario(usuarioDTO);

        return ResponseEntity.ok("Usuário cadastrado");
    }
    
    @GetMapping
    public String paginaCadastro(){
        return "cadastro";
    }

}


//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/api/usuario")
//public class UsuarioController {
//    
//    @Autowired
//    private UsuarioService usuarioService;
//
//    @PostMapping("/cadastrar")
//    public void cadastrarUsuario(
//        @RequestBody CadastrarUsuarioDTO dto
//    ){
//        usuarioService.cadastrar(dto);
//    }
//
//    
//}
