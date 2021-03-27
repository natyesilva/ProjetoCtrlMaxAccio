/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.conexao;
import view.Login;


/**
 *
 * @author Paulo
 */
public class Controle {
     Connection conexaobd = conexao.getConexao();
        
          String item;
            PreparedStatement pst, pstEmpresa, pstAcao, pstHolerite;

    public String getItem() {
        return item;
    }

    public void String(String item) {
        this.item = item;
    }
    public boolean buscarUsuario(Usuario usuario)
    {
        
        String sql = "select * from usuario where login = ? and senha = ?";
        ResultSet rs;
        Login verificar;
        
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getUsuario());
                pst.setInt(2, usuario.getSenha());
                rs = pst.executeQuery();
                               
                if(rs.next())
                {
                    if(rs.getString("").equals(usuario.getUsuario()) && rs.getInt("") == usuario.getSenha())
                    {
                        return true;
                        
                    }
                    else
                    {
                        return false;
                    }
                }
                   
            }catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
            }
            return false;
    }
    public void SalvarAcao(Acao acao)
    {
        try {
            pstAcao = conexao.prepareStatement("INSERT INTO acao(cod_acao,nome,sigla,prioridade) VALUES (?,?,?,?)");
            pstAcao.setInt(1,acao.getCodigo());
            pstAcao.setString(2, acao.getNome());
            pstAcao.setString(3, acao.getSigla());
            pstAcao.setString(4, acao.getPrioridade());
            pstAcao.execute();
            JOptionPane.showMessageDialog(null,"Cadastro efetuado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir"+ex);
        }
    }
}
