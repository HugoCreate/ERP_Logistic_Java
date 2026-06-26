package com.sistema.ERP.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nome_empresa;
    private String tipo_servico;
    private int qtd_operadores;

    public Long getId(){
        return this.id_cliente;
    }

    public String getNomeEmpresa(){
        return this.nome_empresa;
    }
    public void setNomeEmpresa(String new_nome){
        this.nome_empresa = new_nome;
    }

    public String getTipoServico(){
        return this.tipo_servico;
    }
    public void setTipoServico(String new_TipoServico){
        this.tipo_servico = new_TipoServico;
    }

    public int getQtdOperadores(){
        return this.qtd_operadores;
    }
    public void setQtdOperadores(int new_qtd){
        this.qtd_operadores = new_qtd;
    }

}
