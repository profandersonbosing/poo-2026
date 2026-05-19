/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.repositories;

import br.unipar.pet.dogui.domains.Especie;
import br.unipar.pet.dogui.enums.StatusEnum;
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
            + "VALUES (?, ?, ?, ?, ?);";
    
    private static final String UPDATE = 
            "UPDATE especie SET nome = ?, deletado = ?, status = ?, "
            + "dt_atualizacao = ? WHERE id = ?;";
    
    private static final String DELETE = 
            "DELETE FROM especie WHERE id = ?;";
    
    private static final String FIND_BY_ID = 
            "SELECT id, nome, status, deletado, dt_criacao, "
            + " dt_atualizacao FROM especie WHERE id = ?;";
    
    private static final String FIND_ALL = 
            "SELECT id, nome, status, deletado, dt_criacao, dt_atualizacao "
            + "FROM especie ORDER BY nome; ";
                                         
                                         

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
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            
            pstm = conn.prepareStatement(UPDATE);
            
            pstm.setString(1, especie.getNome());
            pstm.setBoolean(2, especie.getDeletado());
            pstm.setString(3, especie.getStatus().toString());
            pstm.setDate(4, new java.sql.Date(especie.getDtAtualizacao().getTime()));
            pstm.setLong(5, especie.getId());
            
            pstm.executeUpdate();
            
            
        } finally {
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        }
        
        return especie;
    
    }

    @Override
    public void deletar(Long id) throws SQLException {
    
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            
            pstm = conn.prepareStatement(DELETE);
            pstm.setLong(1, id);
            
            pstm.executeUpdate();
            
        } finally {
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        }
    
    }

    @Override
    public Especie findById(Long id) throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Especie especie = null;
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            pstm = conn.prepareStatement(FIND_BY_ID);
            pstm.setLong(1, id);
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                especie = new Especie();
                especie.setId(rs.getLong("id"));
                especie.setNome(rs.getString("nome"));
                especie.setDeletado(rs.getBoolean("deletado"));
                especie.setStatus(StatusEnum.valueOf(rs.getString("status")));
                especie.setDtCriacao(rs.getDate("dt_criacao"));
                especie.setDtAtualizacao(rs.getDate("dt_atualizacao"));
            }
            
        } finally {
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        }
        
        return especie;
    
    }

    @Override
    public ArrayList<Especie> listarTodos() throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Especie> listaEspecies = new ArrayList<>();
        
        try {
            
            conn = new ConnectionFactory().getConnection();
            
            pstm = conn.prepareStatement(FIND_ALL);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Especie especie = new Especie();
                especie.setId(rs.getLong("id"));
                especie.setNome(rs.getString("nome"));
                especie.setDeletado(rs.getBoolean("deletado"));
                especie.setStatus(StatusEnum.valueOf(rs.getString("status")));
                especie.setDtCriacao(rs.getDate("dt_criacao"));
                especie.setDtAtualizacao(rs.getDate("dt_atualizacao"));
                
                listaEspecies.add(especie);
            }
            
        } finally {
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        }
        
        return listaEspecies;
    
    }
    
}
