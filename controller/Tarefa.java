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
public class Tarefa {
    private String empresa,acao,prazo;
    
    public String getEmpresa()
    {
        return empresa;
    }
    public void setEmpresa(String empresa)
    {
        this.empresa = empresa;
    }
    public String getAcao()
    {
        return acao;
    }
    public void setAcao(String acao)
    {
        this.acao = acao;
    }
    public String getPrazo()
    {
        return prazo;
    }
    public void setPrazo(String prazo)
    {
        this.prazo = prazo;
    }
}
