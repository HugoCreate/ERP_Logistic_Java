package com.sistema.ERP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/sistema")
public class NavegacaoController {
    
    
    @GetMapping("/Dashboard")
    public String dashboard(){
        return "Dashboard";
    }
    
    @GetMapping("/Equipes")
    public String equipes(){
        return "Equipes";
    }
    
    @GetMapping("/Financeiro")
    public String financeiro(){
        return "financeiro_user";
    }
    
    @GetMapping("/Documentos")
    public String documentos(){
        return "Documentos";
    }
    
    @GetMapping("/Clientes")
    public String clientes(){
        return "Clientes";
    }
    
    @GetMapping("/Recursos")
    public String recursos(){
        return "Recursos";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //@GetMapping("/{pagina}")
    //public String entregarPagina(@PathVariable String pagina){
    //
    //    return switch (pagina){
    //        case "Dashboard" -> "Dashboard";
    //        case "Equipes" -> "Equipes";
    //        case "Financeiro" -> "Financeiro";
    //        case "Documentos" -> "Documentos";
    //        case "Clientes" -> "Clientes";
    //        case "Recursos" -> "Recursos";
    //
    //        default -> "Erro 404";
    //    };        
    //}

}
