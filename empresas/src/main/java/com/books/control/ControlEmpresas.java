/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.books.control;

import com.books.dao.ConectaBanco;
import com.books.model.ModelEmpresa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class ControlEmpresas {
    
    public List<ModelEmpresa> retornaEmpresas(){
        System.out.println("ENTREI");
        List<ModelEmpresa> listaEmpresas = null;
        ConectaBanco conecta = new ConectaBanco();
        try 
        {
            conecta.conexao();
            conecta.executaSQL("select * from empresa;");
            listaEmpresas = new ArrayList<>();
            while(conecta.rs.next()){
                
                ModelEmpresa modelEmpresa = new ModelEmpresa();
                modelEmpresa.setId(conecta.rs.getInt("ID"));
                modelEmpresa.setNomeEmpresa(conecta.rs.getString("nm_empresa"));
                
                listaEmpresas.add(modelEmpresa);
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar Livros "+ 
            ex,"Erro:",JOptionPane.WARNING_MESSAGE);
        }
        finally
        {
            conecta.desconecta();
        }
        
        return listaEmpresas;
    }
}
