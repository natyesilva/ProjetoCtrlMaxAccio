/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Paulo
 */
public class Empresa {
    private String cnpj , nome , tipo_lucro;
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getTipo_lucro()
    {
        return tipo_lucro;
    }
    
    public void setTipo_lucro(String tipo_lucro)
    {
        this.tipo_lucro = tipo_lucro;
    }
}
