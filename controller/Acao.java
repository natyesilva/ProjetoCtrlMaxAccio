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
public class Acao {
    private int codigo;
    private String nome,sigla,prioridade;
    
    
    public int getCodigo()
    {
        return codigo;
    }
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public String getNome()
    {
       return nome; 
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getPrioridade()
    {
        return prioridade;
    }
    public void setPrioridade(String prioridade)
    {
        this.prioridade = prioridade;
    }
    public String getSigla()
    {
        return sigla;
    }
    public void setSigla(String sigla)
    {
        this.sigla =  sigla;
    }

    public void getSigla(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
