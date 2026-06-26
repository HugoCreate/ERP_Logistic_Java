package com.sistema.ERP.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.sistema.ERP.Enums.TipoContratoEnum;;

@Entity
@Table(name = "OPERADORES_LOGISTICA")
public class OperadoresLogistica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_operador;
    private String nome;
    private int idade;
    private TipoContratoEnum tipo_contrato;

    public Long getIdOperador(){
        return this.id_operador;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String new_nome){
        this.nome = new_nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int new_idade){
        this.idade = new_idade;
    }
    
    public TipoContratoEnum getTipoContrato(){
        return this.tipo_contrato;
    }
    public void setTipoContrato(TipoContratoEnum new_TipoContrato){
        this.tipo_contrato = new_TipoContrato;
    }


}
