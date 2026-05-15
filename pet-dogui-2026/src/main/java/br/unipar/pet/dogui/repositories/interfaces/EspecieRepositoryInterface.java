/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.pet.dogui.repositories.interfaces;

import br.unipar.pet.dogui.domains.Especie;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public interface EspecieRepositoryInterface {
    
    public Especie inserir(Especie especie) throws SQLException;
    
    public Especie atualizar(Especie especie) throws SQLException;
    
    public void deletar(Long id) throws SQLException;
    
    public Especie findById(Long id) throws SQLException;
    
    public ArrayList<Especie> listarTodos() throws SQLException;
    
}
