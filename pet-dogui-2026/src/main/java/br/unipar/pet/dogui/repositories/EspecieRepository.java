/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import br.unipar.pet.dogui.domains.Especie;
import br.unipar.pet.dogui.infraestructure.ConnectionFactory;
import br.unipar.pet.dogui.repositories.interfaces.EspecieRepositoryInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.StampedLock;

/**
 *
 * @author andersonbosing
 */
public class EspecieRepository implements EspecieRepositoryInterface {
    
    private static final String INSERT = 
            "INSERT INTO especie (nome, status, deletado, dt_criacao, dt_atualizacao) "
            + "VALUES (?, ?, ?, ?, ?);  ";
    
    private static final String UPDATE = "";
    
    private static final String DELETE = "";
    
    private static final String FIND_BY_ID = "";
    
    private static final String FIND_ALL = "";
                                         
                                         

    @Override
    public Especie inserir(Especie especie) throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            //Crio a conexao de banco
            conn = new ConnectionFactory().getConnection();
            
            //preparo a instrucao sql
            pstm = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            //atribuo os valores do objeto para as colunas do insert de forma ordenada
            pstm.setString(1, especie.getNome());
            pstm.setString(2, especie.getStatus().toString());
            pstm.setBoolean(3, especie.getDeletado());
            pstm.setDate(4, new java.sql.Date(especie.getDtCriacao().getTime()));
            pstm.setDate(5, new java.sql.Date(especie.getDtAtualizacao().getTime()));
            //executo a instrucao
            pstm.executeUpdate();
            //busco o resultset com o id gerado pelo banco através do serial
            rs = pstm.getGeneratedKeys();
            //ativo o rs para leitura e seto no objeto
            if (rs.next()) especie.setId(rs.getLong("id"));
            
            
        } finally {
            
            if (conn != null) conn.close();
            if (pstm != null) pstm.close();
            if (rs != null) rs.close();
        
        }
        
        return especie;
    
    }

    @Override
    public Especie atualizar(Especie especie) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Especie findById(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Especie> listarTodos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
